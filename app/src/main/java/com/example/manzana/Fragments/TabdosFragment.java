package com.example.manzana.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.manzana.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TabdosFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TabdosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabdosFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    RecyclerView recyclerPersonajes;
    ArrayList<PersonajeVo> listaPersonajes;

    public TabdosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabdosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TabdosFragment newInstance(String param1, String param2) {
        TabdosFragment fragment = new TabdosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista=inflater.inflate(R.layout.fragment_tabdos, container, false);

        listaPersonajes=new ArrayList<>();
        recyclerPersonajes= (RecyclerView) vista.findViewById(R.id.recyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        PersonajesAdapter adapter=new PersonajesAdapter(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {

        listaPersonajes.add(new PersonajeVo("Goku","Son Gokū es el protagonista del manga y anime Dragon Ball creado por Akira Toriyama.",R.drawable.ic_home));
        listaPersonajes.add(new PersonajeVo("Gohan","Son Gohan es un personaje del manga y anime Dragon Ball creado por Akira Toriyama. Es el primer hijo de Son Gokū y Chi-Chi",R.drawable.ic_notifications));
        listaPersonajes.add(new PersonajeVo("Goten","Goten es un personaje ficticio de la serie de manga y anime Dragon Ball. Segundo hijo del protagonista, Goku, y Chichi/Milk.",R.drawable.ic_home));
        listaPersonajes.add(new PersonajeVo("Krilin","Krilin es un personaje de la serie de manga y anime Dragon Ball. Es el primer rival en artes marciales de Son Gokū aunque luego se convierte en su mejor amigo.",R.drawable.ic_home));
        listaPersonajes.add(new PersonajeVo("Picoro","Piccolo es un personaje de ficción de la serie de manga y anime Dragon Ball. Su padre, Piccolo Daimaō, surgió tras separarse de Kamisama. ",R.drawable.ic_notifications));
        listaPersonajes.add(new PersonajeVo("Trunks","Trunks es un personaje de ficción de la serie de manga y anime Dragon Ball de Akira Toriyama. Hijo de Vegueta y Bulma",R.drawable.ic_home));
        listaPersonajes.add(new PersonajeVo("Vegueta","Vegeta es un personaje ficticio perteneciente a la raza llamada saiyajin, del manga y anime Dragon Ball.",R.drawable.ic_notifications));

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
