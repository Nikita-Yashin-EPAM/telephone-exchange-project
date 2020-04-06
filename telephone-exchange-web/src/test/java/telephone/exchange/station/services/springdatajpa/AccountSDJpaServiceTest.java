package telephone.exchange.station.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import telephone.exchange.station.model.Account;
import telephone.exchange.station.repositories.AccountRepository;
import telephone.exchange.station.repositories.ProductRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountSDJpaServiceTest {

    public static final String ANY_LAST_NAME = "anyLastName";
    @Mock
    AccountRepository accountRepository;
    @Mock
    ProductRepository productRepository;
    @InjectMocks
    AccountSDJpaService service;
    Account returnAccount;

    @BeforeEach
    void setUp() {
        // each test will have fresh obj
        returnAccount = Account.builder().id(1L).lastName(ANY_LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(accountRepository.findByLastName(any())).thenReturn(returnAccount);
        Account account = service.findByLastName(ANY_LAST_NAME);
        assertEquals(ANY_LAST_NAME, account.getLastName());
        //or
        verify(accountRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Account> accountSet = new HashSet<>();
        accountSet.add(Account.builder().id(1L).build());
        accountSet.add(Account.builder().id(2L).build());
        when(accountRepository.findAll()).thenReturn(accountSet);
        Set<Account> accounts = service.findAll();
        assertNotNull(accounts);
        assertEquals(2, accounts.size());
    }

    @Test
    void findByID() {
        when(accountRepository.findById(anyLong())).thenReturn(Optional.of(returnAccount));
        Account account = service.findByID(1L);
        assertNotNull(account);
    }

    @Test
    void findByIDNotFound() {
        when(accountRepository.findById(anyLong())).thenReturn(Optional.empty());
        Account account = service.findByID(1L);
        assertNull(account);
    }

    @Test
    void save() {
        Account accountToSave = Account.builder().id(1L).build();
        when(accountRepository.save(any())).thenReturn(returnAccount);
        Account savedAccount = service.save(accountToSave);
        assertNotNull(savedAccount);
        // or
        verify(accountRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnAccount);
        verify(accountRepository).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        verify(accountRepository).deleteById(anyLong());
    }
}