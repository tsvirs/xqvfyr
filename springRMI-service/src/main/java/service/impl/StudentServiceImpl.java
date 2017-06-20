package service.impl;

import com.jn.bean.Student;
import mapper.StudentMapper;
import org.springframework.stereotype.Service;
import service.StudentService;
import javax.annotation.Resource;

/**
 * Created by think on 2017/5/1.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;
//
//    public StudentServiceImpl() throws RemoteException {
//    }

    //
//    @Override
//    public int deleteByPrimaryKey(Long id) {
//        return 0;
//    }
//
//    @Override
//    public int insert(Student record) {
//        return 0;
//    }
//
//    @Override
//    public int insertSelective(Student record) {
//        return studentMapper.insertSelective(record);
//    }
//
    @Override
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
//        Student s = new Student();
//        s.setStuName("hello");
//        return s;
    }
//
//    @Override
//    public int updateByPrimaryKeySelective(Student record) {
//        return studentMapper.updateByPrimaryKeySelective(record);
//    }
//
//    @Override
//    public int updateByPrimaryKeyWithBLOBs(Student record) {
//        return 0;
//    }
//
//    @Override
//    public int updateByPrimaryKey(Student record) {
//        return 0;
//    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
