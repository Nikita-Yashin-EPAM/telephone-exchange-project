package telephone.exchange.station.services.map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import telephone.exchange.station.model.Account;

import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AccountServiceMapTest {

    AccountServiceMap accountServiceMap;
    final Long accountId = 1L;
    final String lastName = "Yashin";

    @BeforeMethod
    public void setUp() {
        accountServiceMap = new AccountServiceMap(new ProductServiceMap());
        accountServiceMap.save(Account.builder().id(accountId).lastName(lastName).build());
    }

    @Test
    public void testFindAll() {
        Set<Account> accountSet = accountServiceMap.findAll();
        assertEquals(1, accountSet.size());
    }

    @Test
    public void testDeleteById() {
        accountServiceMap.deleteById(accountId);
        assertEquals(0, accountServiceMap.findAll().size());
    }

    @Test
    public void testDelete() {
        accountServiceMap.delete(accountServiceMap.findByID(accountId));
        assertEquals(0, accountServiceMap.findAll().size());
    }

    @Test
    public void testFindByID() {
        Account account = accountServiceMap.findByID(accountId);
        assertEquals(accountId, account.getId());
    }

    @Test
    public void testSave() {
        Long id = 2L;
        Account account2 = Account.builder().id(2L).build();
        Account saveAccount = accountServiceMap.save(account2);
        assertEquals(id, saveAccount.getId());
    }

    @Test
    void saveNoId(){
        Account account = accountServiceMap.save(Account.builder().build());
        assertNotNull(account);
        assertNotNull(account.getId());
    }

    @Test
    public void testFindByLastName() {
        Account yashin = accountServiceMap.findByLastName("Yashin");
        assertNotNull(yashin);
        assertEquals(accountId, yashin.getId());
    }
}