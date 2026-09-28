package defpackage;

import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ss40 implements c.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ ss40(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.material.tabs.c.b
    public void a(TabLayout.g gVar, int i) {
        SportyMediaHostFragment sportyMediaHostFragment = (SportyMediaHostFragment) this.a;
        SportyMediaHostFragment.b bVar = sportyMediaHostFragment.D;
        if (bVar == null) {
            Intrinsics.n("fragmentAdapter");
            throw null;
        }
        ArrayList arrayList = bVar.z;
        int iIntValue = ((Number) ((i < 0 || i >= arrayList.size()) ? Integer.valueOf(R.string.sporty_news__media_header_title) : arrayList.get(i))).intValue();
        jrc0 jrc0VarA = jrc0.a(LayoutInflater.from(sportyMediaHostFragment.requireContext()));
        jrc0VarA.d.setText(sn5.d(sportyMediaHostFragment, iIntValue, new Object[0]));
        ConstraintLayout constraintLayout = jrc0VarA.a;
        constraintLayout.getClass();
        gVar.c(constraintLayout);
        gVar.a = Integer.valueOf(iIntValue);
    }
}
