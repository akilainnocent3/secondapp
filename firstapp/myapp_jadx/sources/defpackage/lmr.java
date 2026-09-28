package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lmr extends RecyclerView.d0 {
    public final ylr a;
    public final ydm b;

    /* JADX WARN: Illegal instructions before constructor call */
    public lmr(ylr ylrVar, ydm ydmVar) {
        ConstraintLayout constraintLayout = ylrVar.a;
        super(constraintLayout);
        this.a = ylrVar;
        this.b = ydmVar;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: kmr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ydm ydmVar2;
                Object tag = view.getTag();
                if (!(tag instanceof xlr)) {
                    tag = null;
                }
                final xlr xlrVar = (xlr) tag;
                if (xlrVar == null || (ydmVar2 = this.a.b) == null) {
                    return;
                }
                final dfm dfmVar = ydmVar2.a;
                ulr ulrVar = ydmVar2.b;
                List<String> list = dfm.v2;
                ArrayList arrayList = new ArrayList();
                for (T t : ulrVar.a.f) {
                    String str = t.a;
                    String str2 = t.b;
                    String str3 = t.c;
                    boolean zEquals = TextUtils.equals(xlrVar.b, str2);
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    arrayList.add(new xlr(str, str2, str3, zEquals));
                }
                ulrVar.j(arrayList, new Runnable() { // from class: vem
                    @Override // java.lang.Runnable
                    public final void run() {
                        List<String> list2 = dfm.v2;
                        dfm dfmVar2 = dfmVar;
                        dfmVar2.E.setLanguage(xlrVar.b);
                        yec yecVar = dfmVar2.U1;
                        if (yecVar != null) {
                            yecVar.dismiss();
                        }
                        if (dfmVar2.getActivity() != null) {
                            dfmVar2.getActivity().getIntent().putExtra("tab_tag", "Home");
                        }
                    }
                });
            }
        });
    }
}
