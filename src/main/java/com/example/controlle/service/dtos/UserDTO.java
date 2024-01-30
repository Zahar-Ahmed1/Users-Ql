package com.example.controlle.service.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO implements List<UserDTO> {
    private String name;
    private String email;
    private Date date_Naissance;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<UserDTO> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(UserDTO userDTO) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends UserDTO> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends UserDTO> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public UserDTO get(int index) {
        return null;
    }

    @Override
    public UserDTO set(int index, UserDTO element) {
        return null;
    }

    @Override
    public void add(int index, UserDTO element) {

    }

    @Override
    public UserDTO remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<UserDTO> listIterator() {
        return null;
    }

    @Override
    public ListIterator<UserDTO> listIterator(int index) {
        return null;
    }

    @Override
    public List<UserDTO> subList(int fromIndex, int toIndex) {
        return null;
    }
}
