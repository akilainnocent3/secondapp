package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.multimaker.MultiMakerConstKt;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class clw {
    public final int a;
    public final vid0 b;
    public final mpe0 c;
    public Function0<Unit> d;
    public Function2<? super thw, ? super List<ehw>, Unit> e;
    public Function1<? super thw, ? extends List<ehw>> f;
    public thw g;

    public clw(Context context, int i) {
        this.a = i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.spr_multi_select_popup_view, (ViewGroup) null, false);
        int i2 = R.id.apply;
        TextView textView = (TextView) h5e.a(R.id.apply, viewInflate);
        if (textView != null) {
            i2 = R.id.cancel;
            TextView textView2 = (TextView) h5e.a(R.id.cancel, viewInflate);
            if (textView2 != null) {
                i2 = R.id.recycler;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler, viewInflate);
                if (recyclerView != null) {
                    this.b = new vid0((ConstraintLayout) viewInflate, textView, textView2, recyclerView);
                    int i3 = 1;
                    this.c = hwr.b(new qyr(this, i3));
                    this.d = new vkw(0);
                    this.e = new uf9(i3);
                    this.f = new wkw();
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a() {
        Collection collection;
        vid0 vid0Var = this.b;
        RecyclerView.f adapter = vid0Var.d.getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof tkw)) {
                adapter = null;
            }
            tkw tkwVar = (tkw) adapter;
            if (tkwVar == null || (collection = tkwVar.a.f) == null) {
                return;
            }
            TextView textView = vid0Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                ehw ehwVar = (ehw) obj;
                if (ehwVar.d && !Intrinsics.g(ehwVar.a, MultiMakerConstKt.ID_SELECT_ALL)) {
                    arrayList.add(obj);
                }
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((ehw) obj2).c) {
                        z = true;
                        break;
                    }
                }
            }
            textView.setEnabled(z);
        }
    }
}
