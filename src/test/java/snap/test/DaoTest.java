package snap.test;

import com.snap.dao.mapper.BooksMapper;
import com.snap.dao.mapper.BooksTypeMapper;
import com.snap.dao.pojo.BookType;
import com.snap.dao.pojo.Books;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class DaoTest {
    @Autowired
    private BooksMapper booksMapper;
    @Autowired
    private BooksTypeMapper booksTypeMapper;

    @Test
    public void ConnTest() {
        System.out.println(booksTypeMapper.selectOrder());
    }
}
