package telephone.exchange.station.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.services.AccountService;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class AccountControllerTest {
    @Mock
    AccountService accountService;
    Set<Account> accountSet;

    @InjectMocks
    AccountController accountController;
    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        accountSet = new HashSet<>();
        accountSet.add(Account.builder().id(1L).build());
        accountSet.add(Account.builder().id(2L).build());
        mockMvc = MockMvcBuilders
                .standaloneSetup(accountController)
                .build();
    }

    @Test
    void listAccounts() throws Exception {
        when(accountService.findAll()).thenReturn(accountSet);
        mockMvc.perform(get("/accounts"))
                .andExpect(status().isOk())// http 200 ok
                .andExpect(view().name("accounts/index"))
                .andExpect(model().attribute("accounts", hasSize(2)));
    }

    // TODO: 2020-04-06 change when findOwners will be implemented
    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/accounts/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("notimplemented"));
    }
    @Test
    void findOwners2() throws Exception {
        mockMvc.perform(get("/accounts/find"))
                .andExpect(status().is4xxClientError());
    }
}