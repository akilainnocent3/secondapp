package defpackage;

import android.util.SparseArray;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.ChooseBetActivity$initViewModel$2", f = "ChooseBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class km7 extends tje0 implements Function2<hw2, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChooseBetActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km7(ChooseBetActivity chooseBetActivity, v1b<? super km7> v1bVar) {
        super(2, v1bVar);
        this.b = chooseBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        km7 km7Var = new km7(this.b, v1bVar);
        km7Var.a = obj;
        return km7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hw2 hw2Var, v1b<? super Unit> v1bVar) {
        return ((km7) create(hw2Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hw2 hw2Var = (hw2) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!Intrinsics.g(hw2Var, hw2.b.a)) {
            boolean zG = Intrinsics.g(hw2Var, hw2.c.a);
            ChooseBetActivity chooseBetActivity = this.b;
            if (zG) {
                zfd0 zfd0Var = chooseBetActivity.b;
                if (zfd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zfd0Var.d.K();
            } else {
                int i = 0;
                if (Intrinsics.g(hw2Var, hw2.e.a)) {
                    zfd0 zfd0Var2 = chooseBetActivity.b;
                    if (zfd0Var2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var2.i.setRefreshing(false);
                } else if (Intrinsics.g(hw2Var, hw2.a.a)) {
                    zfd0 zfd0Var3 = chooseBetActivity.b;
                    if (zfd0Var3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var3.d.I();
                    zfd0 zfd0Var4 = chooseBetActivity.b;
                    if (zfd0Var4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var4.i.setRefreshing(false);
                } else if (Intrinsics.g(hw2Var, hw2.d.a)) {
                    int i2 = ChooseBetActivity.y;
                    zfd0 zfd0Var5 = chooseBetActivity.b;
                    if (zfd0Var5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var5.d.H(chooseBetActivity.getCMSString(R.string.bet_history__no_tickets_available, new Object[0]));
                    zfd0 zfd0Var6 = chooseBetActivity.b;
                    if (zfd0Var6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var6.d.L(new dm7(chooseBetActivity, i));
                } else {
                    if (!(hw2Var instanceof hw2.f)) {
                        uhc.a();
                        return null;
                    }
                    zfd0 zfd0Var7 = chooseBetActivity.b;
                    if (zfd0Var7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var7.i.setRefreshing(false);
                    zfd0 zfd0Var8 = chooseBetActivity.b;
                    if (zfd0Var8 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zfd0Var8.d.E();
                    g98 g98Var = chooseBetActivity.d;
                    if (g98Var == null) {
                        ArrayList<hl30> arrayList = ((hw2.f) hw2Var).a;
                        g98 g98Var2 = new g98();
                        g98Var2.b = new SparseArray<>();
                        g98Var2.i = -1;
                        g98Var2.c = chooseBetActivity;
                        g98Var2.a = arrayList;
                        g98Var2.w = chooseBetActivity;
                        if (!chooseBetActivity.A1()) {
                            g98Var2.f = 10;
                        }
                        g98Var2.e = true;
                        g98Var2.v = chooseBetActivity.A1();
                        g98Var2.notifyDataSetChanged();
                        chooseBetActivity.d = g98Var2;
                        zfd0 zfd0Var9 = chooseBetActivity.b;
                        if (zfd0Var9 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        zfd0Var9.f.setAdapter(g98Var2);
                    } else {
                        ArrayList<hl30> arrayList2 = ((hw2.f) hw2Var).a;
                        g98Var.i();
                        g98Var.b.clear();
                        g98Var.a = arrayList2;
                        g98Var.notifyDataSetChanged();
                    }
                }
            }
        }
        return Unit.a;
    }
}
