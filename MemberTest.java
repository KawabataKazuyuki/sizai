package org.jboss.as.quickstarts.kitchensink.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Memberクラスの単体テストクラス
 */
public class MemberTest {

    private Member member;

    @Before
    public void setUp() {
        member = new Member();
    }

    /**
     * getIdとsetIdのテスト
     */
    @Test
    public void testGetAndSetId() {
        Long id = 1L;
        member.setId(id);
        assertEquals(id, member.getId());
    }

    /**
     * getNameとsetNameのテスト
     */
    @Test
    public void testGetAndSetName() {
        String name = "John Doe";
        member.setName(name);
        assertEquals(name, member.getName());
    }

    /**
     * getEmailとsetEmailのテスト
     */
    @Test
    public void testGetAndSetEmail() {
        String email = "john.doe@example.com";
        member.setEmail(email);
        assertEquals(email, member.getEmail());
    }

    /**
     * getPhoneNumberとsetPhoneNumberのテスト
     */
    @Test
    public void testGetAndSetPhoneNumber() {
        String phoneNumber = "1234567890";
        member.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, member.getPhoneNumber());
    }
}
