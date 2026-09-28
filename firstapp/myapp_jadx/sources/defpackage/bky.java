package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.home.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class bky extends RecyclerView.d0 {
    public final ojy a;
    public final aem b;

    /* JADX WARN: Illegal instructions before constructor call */
    public bky(ojy ojyVar, aem aemVar) {
        ConstraintLayout constraintLayout = ojyVar.a;
        super(constraintLayout);
        this.a = ojyVar;
        this.b = aemVar;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: aky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aem aemVar2;
                Object tag = view.getTag();
                if (!(tag instanceof njy)) {
                    tag = null;
                }
                final njy njyVar = (njy) tag;
                if (njyVar == null || (aemVar2 = this.a.b) == null) {
                    return;
                }
                final dfm dfmVar = aemVar2.a;
                mjy mjyVar = aemVar2.b;
                List<String> list = dfm.v2;
                ArrayList arrayList = new ArrayList();
                Iterator it = mjyVar.a.f.iterator();
                while (it.hasNext()) {
                    ljy ljyVar = ((njy) it.next()).a;
                    boolean z = njyVar.a == ljyVar;
                    ljyVar.getClass();
                    arrayList.add(new njy(ljyVar, z));
                }
                mjyVar.j(arrayList, new Runnable() { // from class: bfm
                    @Override // java.lang.Runnable
                    public final void run() {
                        List<String> list2 = dfm.v2;
                        dfm dfmVar2 = dfmVar;
                        yec yecVar = dfmVar2.U1;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        if (dfmVar2.getActivity() != null) {
                            dfmVar2.getActivity().getIntent().putExtra("tab_tag", "Home");
                        }
                        if (dfmVar2.g2.y1(njyVar.a, wjy.a)) {
                            ((MainActivity) dfmVar2.getActivity()).recreateActivity();
                        }
                    }
                });
            }
        });
    }
}
