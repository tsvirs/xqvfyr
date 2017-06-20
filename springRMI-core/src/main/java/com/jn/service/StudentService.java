package com.jn.service;

import com.jn.bean.Student;

/**
 * Created by think on 2017/5/1.
 */
public interface StudentService  {

//    int deleteByPrimaryKey(Long id) throws RemoteException;
//
//    int insert(Student record) throws RemoteException;
//
//    int insertSelective(Student record) throws RemoteException;
//
    Student selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(Student record) throws RemoteException;
//
//    int updateByPrimaryKeyWithBLOBs(Student record) throws RemoteException;
//
//    int updateByPrimaryKey(Student record) throws RemoteException;

     int add(int a, int b);

}
