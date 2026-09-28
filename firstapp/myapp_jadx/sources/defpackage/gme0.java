package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgme0;", "Lj8i0;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gme0 extends j8i0 {
    public final wwd0 a;
    public final wwd0 b;
    public final v340 c;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.SwitchBankDialogViewModel$uiStateFlow$1", f = "SwitchBankDialogViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<fme0, List<? extends aoe0.a>, v1b<? super fme0>, Object> {
        public /* synthetic */ fme0 a;
        public /* synthetic */ List b;

        /* JADX INFO: renamed from: gme0$a$a, reason: collision with other inner class name */
        public static final class C0603a<T> implements Comparator {
            public final /* synthetic */ fme0 a;

            public C0603a(fme0 fme0Var) {
                this.a = fme0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String str = ((aoe0.a) t).b;
                fme0 fme0Var = this.a;
                Boolean boolValueOf = str != null ? Boolean.valueOf(!c.u(str, fme0Var.d.a.b, true)) : Boolean.FALSE;
                String str2 = ((aoe0.a) t2).b;
                return boolValueOf.compareTo(str2 != null ? Boolean.valueOf(!c.u(str2, fme0Var.d.a.b, true)) : Boolean.FALSE);
            }
        }

        public static final class b<T> implements Comparator {
            public final /* synthetic */ C0603a a;

            public b(C0603a c0603a) {
                this.a = c0603a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = this.a.compare(t, t2);
                return iCompare != 0 ? iCompare : vl8.b(((aoe0.a) t).b, ((aoe0.a) t2).b);
            }
        }

        @Override // defpackage.gaj
        public final Object invoke(fme0 fme0Var, List<? extends aoe0.a> list, v1b<? super fme0> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = fme0Var;
            aVar.b = list;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            fme0 fme0Var = this.a;
            List listR0 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = fme0Var.e;
            nk0 nk0Var = fme0Var.d.a;
            if ((z && nk0Var.b.length() == 0) || (!z && listR0.isEmpty())) {
                listR0 = m2g.a;
            } else if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listR0) {
                    String str = ((aoe0.a) obj2).b;
                    if (str != null && StringsKt.M(str, nk0Var.b, true)) {
                        arrayList.add(obj2);
                    }
                }
                listR0 = CollectionsKt.r0(arrayList, new b(new C0603a(fme0Var)));
            }
            List list = listR0;
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((aoe0.a) it.next()).f) {
                    return fme0.a(fme0Var, list, i, null, false, 25);
                }
                i++;
            }
            i = -1;
            return fme0.a(fme0Var, list, i, null, false, 25);
        }
    }

    public gme0() {
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.a = wwd0VarA;
        fme0 fme0Var = fme0.f;
        wwd0 wwd0VarA2 = xwd0.a(fme0Var);
        this.b = wwd0VarA2;
        this.c = e1i.e(new n1i(wwd0VarA2, wwd0VarA, new a(3, null)), o8i0.d(this), q490.a.a, fme0Var);
    }
}
