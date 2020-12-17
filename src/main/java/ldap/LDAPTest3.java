package ldap;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.naming.directory.DirContext;

public class LDAPTest3 {


  public boolean test(String user, String pass, DirContext ctx)
      throws NamingException {
    user = user + "_USER";

    String filter = "(&(uid=" + user + ")(userPassword=" + pass + "))";

    NamingEnumeration<SearchResult> results = ctx
        .search("ou=system", filter, new SearchControls());
    return results.hasMore();
  }

}