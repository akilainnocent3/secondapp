package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ami0 implements lyh<mli0> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ hmi0 b;

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$special$$inlined$combine$1", f = "VirtualLobbyViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ami0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$special$$inlined$combine$1$3", f = "VirtualLobbyViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super mli0>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ hmi0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, hmi0 hmi0Var) {
            super(3, v1bVar);
            this.d = hmi0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super mli0> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:77:0x01b4 A[RETURN] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            vki0 vki0Var;
            qgi0 cVar;
            Sports sports;
            mli0 mli0Var;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                thi0 thi0Var = (thi0) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                fqo.c cVar2 = (fqo.c) obj3;
                Object obj4 = objArr[2];
                obj4.getClass();
                vki0 vki0Var2 = (vki0) obj4;
                Object obj5 = objArr[3];
                obj5.getClass();
                vji0 vji0Var = (vji0) obj5;
                Object obj6 = objArr[4];
                obj6.getClass();
                boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                Object obj7 = objArr[5];
                uji0 uji0Var = obj7 instanceof uji0 ? (uji0) obj7 : null;
                Object obj8 = objArr[6];
                obj8.getClass();
                lk50 lk50Var = (lk50) obj8;
                Object obj9 = objArr[7];
                obj9.getClass();
                lk50 lk50Var2 = (lk50) obj9;
                Object obj10 = objArr[8];
                obj10.getClass();
                lk50 lk50Var3 = (lk50) obj10;
                Object obj11 = objArr[9];
                obj11.getClass();
                boolean zBooleanValue2 = ((Boolean) obj11).booleanValue();
                Boolean bool = (Boolean) objArr[10];
                if (thi0Var instanceof thi0.b) {
                    cVar = qgi0.b.a;
                } else if (thi0Var instanceof thi0.a) {
                    cVar = new qgi0.a();
                } else {
                    if (!(thi0Var instanceof thi0.c)) {
                        uhc.a();
                        return null;
                    }
                    if (hmi0.y1(cVar2) && (vki0Var2 instanceof vki0.b) && (vji0Var instanceof vji0.b)) {
                        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                        StringUiText stringUiText = vch0.a;
                        mli0Var = new mli0(new fqo(R.color.background_type2_primary, c0579a, new ResourceUiText(R.string.page_virtual__virtuals), cVar2), qgi0.b.a, uji0Var, zBooleanValue2);
                    } else {
                        iki0 iki0Var = vji0Var instanceof vji0.d ? ((vji0.d) vji0Var).a : new iki0(0);
                        qcn<kwv> qcnVar = iki0Var.a;
                        if (qcnVar == null || !qcnVar.isEmpty()) {
                            Iterator<kwv> it = qcnVar.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    wwv wwvVar = it.next().l;
                                    if (wwvVar == wwv.a || wwvVar == wwv.c || wwvVar == wwv.b) {
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        iki0 iki0Var2 = iki0Var;
                        uf00 uf00VarA = a4h.a(vki0.a.d, new vki0.b(z));
                        Iterator itListIterator = ((n4) uf00VarA).listIterator(0);
                        do {
                            if (!itListIterator.hasNext()) {
                                ibh0.a("Collection contains no element matching the predicate.");
                                return null;
                            }
                            vki0Var = (vki0) itListIterator.next();
                        } while (!(vki0Var instanceof vki0.b));
                        if (!hmi0.y1(cVar2) || !(vki0Var2 instanceof vki0.b)) {
                            vki0Var = vki0.a.d;
                        }
                        cVar = new qgi0.c(new pgi0(vki0Var, uf00VarA, hmi0.y1(cVar2), zBooleanValue, Intrinsics.g(bool, Boolean.FALSE) && Intrinsics.g(bm50.i(lk50Var), Boolean.TRUE) && (sports = (Sports) bm50.i(lk50Var2)) != null && sports.getActive() && bm50.i(lk50Var3) != null, ((thi0.c) thi0Var).a, iki0Var2));
                    }
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(mli0Var, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                fqo.a.C0579a c0579a2 = fqo.a.C0579a.a;
                StringUiText stringUiText2 = vch0.a;
                mli0Var = new mli0(new fqo(R.color.background_type2_primary, c0579a2, new ResourceUiText(R.string.page_virtual__virtuals), cVar2), cVar, uji0Var, zBooleanValue2);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(mli0Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public ami0(lyh[] lyhVarArr, hmi0 hmi0Var) {
        this.a = lyhVarArr;
        this.b = hmi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super mli0> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
