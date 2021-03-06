package com.example.anthony.a20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.anthony.a20.Adapters.TeacherAdapter;
import com.example.anthony.a20.Entities.Teacher;


import java.util.ArrayList;

public class TeacherFragment extends Fragment {

    public TeacherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.teacher_list, container, false);
        final ArrayList<Teacher> teachers= new ArrayList<Teacher>();
        teachers.add(new Teacher("Profesor1",Float.parseFloat("2.5"),R.drawable.logo));
        teachers.add(new Teacher("Profesor2",Float.parseFloat("3.5"),R.drawable.logo));
        teachers.add(new Teacher("Profesor3",Float.parseFloat("2.2"),R.drawable.logo));
        teachers.add(new Teacher("Profesor4",Float.parseFloat("3.9"),R.drawable.logo));
        teachers.add(new Teacher("Profesor5",Float.parseFloat("5.0"),R.drawable.logo));
        teachers.add(new Teacher("Profesor6",Float.parseFloat("1.8"),R.drawable.logo));
        teachers.add(new Teacher("Profesor7",Float.parseFloat("4.2"),R.drawable.logo));
        teachers.add(new Teacher("Profesor8",Float.parseFloat("3.1"),R.drawable.logo));
        TeacherAdapter teacherAdapter = new TeacherAdapter(getActivity(),teachers,R.color.white);
        final ListView listView = (ListView)rootView.findViewById(R.id.teacher_list);
        listView.setAdapter(teacherAdapter);
        return rootView;
    }

}
