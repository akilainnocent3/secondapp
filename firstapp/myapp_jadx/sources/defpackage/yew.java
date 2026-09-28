package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.multimaker.presentation.widget.filter.FilterTabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity$collectData$1$1", f = "MultiMakerActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yew extends tje0 implements Function2<kiw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ MultiMakerActivity b;
    public final /* synthetic */ kid0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yew(MultiMakerActivity multiMakerActivity, kid0 kid0Var, v1b<? super yew> v1bVar) {
        super(2, v1bVar);
        this.b = multiMakerActivity;
        this.c = kid0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yew yewVar = new yew(this.b, this.c, v1bVar);
        yewVar.a = obj;
        return yewVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kiw kiwVar, v1b<? super Unit> v1bVar) {
        return ((yew) create(kiwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final kiw kiwVar = (kiw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        fiw fiwVar = kiwVar.a;
        int i = kiwVar.f;
        ogw ogwVar = kiwVar.b;
        boolean z = fiwVar.b;
        MultiMakerActivity multiMakerActivity = this.b;
        whw whwVar = multiMakerActivity.w;
        int i2 = 0;
        final kid0 kid0Var = this.c;
        if (z) {
            if (whwVar != null) {
                int i3 = fiwVar.c;
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(Unit.a);
                }
                whwVar.i(arrayList);
            }
            zhw zhwVar = multiMakerActivity.v;
            if (zhwVar != null) {
                zhwVar.i(m2g.a);
            }
        } else {
            if (whwVar != null) {
                whwVar.i(m2g.a);
            }
            final List<MultiMakerSport> list = kiwVar.a.a;
            zhw zhwVar2 = multiMakerActivity.v;
            if (zhwVar2 != null) {
                zhwVar2.j(list, new Runnable() { // from class: vew
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list2 = list;
                        Iterator it = list2.iterator();
                        final int i5 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i5 = -1;
                                break;
                            } else if (((MultiMakerSport) it.next()).e) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (list2.isEmpty() || i5 < 0 || i5 >= list2.size()) {
                            return;
                        }
                        final kid0 kid0Var2 = kid0Var;
                        kid0Var2.w.post(new Runnable() { // from class: xew
                            @Override // java.lang.Runnable
                            public final void run() {
                                kid0Var2.w.s0(i5);
                            }
                        });
                    }
                });
            }
        }
        boolean z2 = ogwVar.a && i == 0;
        FilterTabLayout filterTabLayout = kid0Var.e;
        final FilterTabLayout filterTabLayout2 = kid0Var.e;
        Iterator<T> it = filterTabLayout.G.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setEnabled(z2);
        }
        boolean z3 = ogwVar.b;
        mid0 mid0Var = filterTabLayout2.F;
        mid0Var.b.setVisibility(z3 ? 8 : 0);
        mid0Var.i.setVisibility(z3 ? 0 : 8);
        filterTabLayout2.I(ogwVar.c);
        List<UiText> list2 = ogwVar.d;
        list2.getClass();
        filterTabLayout2.F.d.setText(CollectionsKt.a0(list2, ", ", null, null, new enh(filterTabLayout2, i2), 30));
        List<UiText> list3 = ogwVar.e;
        list3.getClass();
        filterTabLayout2.F.e.setText(CollectionsKt.a0(list3, ", ", null, null, new Function1() { // from class: dnh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return FilterTabLayout.G(filterTabLayout2, (UiText) obj2);
            }
        }, 30));
        zfw zfwVar = multiMakerActivity.y;
        if (zfwVar != null) {
            zfwVar.i(kiwVar.e);
        }
        uhw uhwVar = multiMakerActivity.z;
        if (uhwVar != null) {
            if (i < 0) {
                i = 0;
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (int i5 = 0; i5 < i; i5++) {
                arrayList2.add(Unit.a);
            }
            uhwVar.j(arrayList2, new Runnable() { // from class: wew
                @Override // java.lang.Runnable
                public final void run() {
                    if (kiwVar.f > 0) {
                        kid0 kid0Var2 = kid0Var;
                        RecyclerView.f adapter = kid0Var2.v.getAdapter();
                        if (adapter != null) {
                            kid0Var2.v.s0(adapter.getItemCount() - 1);
                        }
                    }
                }
            });
        }
        kid0Var.i.a.setVisibility(kiwVar.g ? 0 : 8);
        kid0Var.f.setVisibility(kiwVar.h ? 0 : 8);
        boolean z4 = kiwVar.j;
        FrameLayout frameLayout = kid0Var.b;
        if (z4) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
        }
        boolean z5 = kiwVar.i;
        FrameLayout frameLayout2 = kid0Var.c;
        if (z5) {
            frameLayout2.setVisibility(0);
        } else {
            frameLayout2.setVisibility(8);
        }
        return Unit.a;
    }
}
