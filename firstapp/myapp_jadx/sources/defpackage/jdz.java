package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jdz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jdz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SHKeypadContainer sHKeypadContainer;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                OverUnderComponent overUnderComponent = (OverUnderComponent) obj;
                int i2 = OverUnderComponent.e0;
                try {
                    overUnderComponent.p();
                    overUnderComponent.t();
                    sHKeypadContainer = overUnderComponent.U;
                    if (sHKeypadContainer == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                } catch (Exception unused) {
                    overUnderComponent.t();
                    sHKeypadContainer = overUnderComponent.U;
                    if (sHKeypadContainer == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                } catch (Throwable th) {
                    overUnderComponent.t();
                    SHKeypadContainer sHKeypadContainer2 = overUnderComponent.U;
                    if (sHKeypadContainer2 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer2.setVisibility(8);
                    overUnderComponent.z = 0;
                    throw th;
                }
                sHKeypadContainer.setVisibility(8);
                overUnderComponent.z = 0;
                return Unit.a;
            default:
                final t0k0 t0k0Var = (t0k0) obj;
                return new iu2.b() { // from class: q0k0
                    @Override // iu2.a
                    public final void C() {
                        ArrayList arrayList;
                        t0k0 t0k0Var2 = t0k0Var;
                        if (t0k0Var2.N.getValue() instanceof n0k0.d) {
                            ArrayList arrayList2 = t0k0Var2.G;
                            int i3 = 0;
                            ArrayList arrayList3 = null;
                            if (arrayList2 != null) {
                                ArrayList arrayList4 = new ArrayList(l48.r(arrayList2, 10));
                                int size = arrayList2.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    Object obj2 = arrayList2.get(i4);
                                    i4++;
                                    arrayList4.add(new dtg(new Event(((dtg) obj2).a)));
                                }
                                arrayList = new ArrayList(arrayList4);
                            } else {
                                arrayList = null;
                            }
                            t0k0Var2.G = arrayList;
                            ArrayList arrayList5 = t0k0Var2.H;
                            if (arrayList5 != null) {
                                ArrayList arrayList6 = new ArrayList(l48.r(arrayList5, 10));
                                int size2 = arrayList5.size();
                                while (i3 < size2) {
                                    Object obj3 = arrayList5.get(i3);
                                    i3++;
                                    arrayList6.add(new dtg(new Event(((dtg) obj3).a)));
                                }
                                arrayList3 = new ArrayList(arrayList6);
                            }
                            t0k0Var2.H = arrayList3;
                            t0k0Var2.L1();
                        }
                    }
                };
        }
    }
}
