package arquitectura.proyecto.android.appsgpl.Interfaces;

import java.util.List;

import arquitectura.proyecto.android.appsgpl.POJOS.Personal;

/**
 * Created by Jair Barzola on 21-Apr-17.
 */

public interface TwoFragmentPresenter {
    void initRecycler(List<Personal> personalList);
    void loadListPersonal();
}
