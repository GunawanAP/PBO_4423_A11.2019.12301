/*
 * NAMA : GUNAWAN AGUNG.P
 * NIM  : A11.2019.12301
 * KEL  : A11.4423
 */
package controller;

import Inputan.InputanSewaBuku;
import Interfaces.InterfacesSewaBuku;
import Model.TabelSewaBuku;
import Model.mTable;
import gui.maingui;
import java.util.List;

/**
 *
 * @author gunawan agung
 */
public class cSewaBuku {
    public cSewaBuku(maingui _tampil){
        this._tampilan = _tampil;
        InterfacesSewaBuku = new InputanSewaBuku();
    }
    
        public void IsiTable(){
      list_sewaBuku = InterfacesSewaBuku.GetAll();
      TabelSewaBuku tabelSewaBuku = new TabelSewaBuku(list_sewaBuku);
      _tampilan.GetTabelData().setModel(tabelSewaBuku);
        
    }
       
       maingui _tampilan;
       InterfacesSewaBuku InterfacesSewaBuku;
       List<mTable> list_sewaBuku;    
}
