package defpackage;

import android.R;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTabHost;
import androidx.fragment.app.a;
import com.sportybet.android.home.MainActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ziu implements lfy {
    public final /* synthetic */ MainActivity a;

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = MainActivity.m0;
        final MainActivity mainActivity = this.a;
        ArrayList<d1f0> arrayList = mainActivity.i;
        int iD1 = mainActivity.D1("Promote");
        int iD2 = mainActivity.D1("Game");
        if (iD1 >= 0 || iD2 >= 0) {
            int i2 = iD1 >= 0 ? iD1 : iD2;
            if (mainActivity.z.equalsIgnoreCase(mainActivity.z1().a)) {
                return;
            }
            iv6 iv6VarZ1 = mainActivity.z1();
            boolean z = iv6VarZ1.d;
            if (z && iD2 < 0) {
                arrayList.remove(mainActivity.D1("Promote"));
                arrayList.add(i2, new d1f0(mainActivity.B1(), m0t.class, "Game", mainActivity.C1()));
                mainActivity.d.getTabWidget().getChildAt(mainActivity.D1("Game")).setOnClickListener(new View.OnClickListener() { // from class: gju
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = MainActivity.m0;
                        MainActivity mainActivity2 = mainActivity;
                        String tag = mainActivity2.d.newTabSpec("Game").getTag();
                        FragmentManager supportFragmentManager = mainActivity2.getSupportFragmentManager();
                        a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                        Fragment fragmentH = mainActivity2.getSupportFragmentManager().H(tag);
                        if (fragmentH != null) {
                            aVarA.p(fragmentH);
                        }
                        aVarA.e(R.id.tabcontent, new m0t(), tag, 1);
                        aVarA.d();
                        mainActivity2.d.setCurrentTab(2);
                        mainActivity2.J1();
                        mainActivity2.H1("Game");
                    }
                });
            }
            if (!z && iD1 < 0) {
                arrayList.remove(mainActivity.D1("Game"));
                arrayList.add(i2, new d1f0(0, fbe0.class, "Promote", mainActivity.z1().c));
                mainActivity.d.getTabWidget().getChildAt(mainActivity.D1("Promote")).setOnClickListener(new View.OnClickListener() { // from class: hju
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = MainActivity.m0;
                        sh8.c().e(mainActivity.z);
                    }
                });
            }
            mainActivity.z = iv6VarZ1.a;
            mainActivity.A = iv6VarZ1.b;
            d1f0 d1f0Var = arrayList.get(i2);
            d1f0Var.c = z ? mainActivity.C1() : iv6VarZ1.c;
            FragmentTabHost fragmentTabHost = mainActivity.d;
            if (fragmentTabHost == null || fragmentTabHost.getTabWidget() == null || mainActivity.d.getTabWidget().getChildCount() <= i2) {
                return;
            }
            mainActivity.K1(mainActivity.d.getTabWidget().getChildAt(i2), d1f0Var);
        }
    }
}
