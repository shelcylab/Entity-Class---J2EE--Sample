/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitypack;

import java.util.List;

/**
 *
 * @author shelc
 */
@javax.ejb.Local
public interface BookAuthFacadeLocal {

    void create(BookAuth bookAuth);

    void edit(BookAuth bookAuth);

    void remove(BookAuth bookAuth);

    BookAuth find(Object id);

    List<BookAuth> findAll();

    List<BookAuth> findRange(int[] range);

    int count();
    
}
