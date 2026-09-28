package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class e3r implements lyh<v4r> {
    public final /* synthetic */ b77 a;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$resultBottomSheetState$lambda$0$$inlined$map$1", f = "LNPlaceBetViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return e3r.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$resultBottomSheetState$lambda$0$$inlined$map$1$2", f = "LNPlaceBetViewModel.kt", l = {50}, m = "emit", v = 2)
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
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            v4r cVar;
            UiText stringUiText;
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.a) {
                    cVar = v4r.b.a.a;
                } else if (lk50Var.equals(lk50.b.a)) {
                    cVar = v4r.b.C1205b.a;
                } else {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    d7r d7rVar = (d7r) ((lk50.c) lk50Var).a;
                    qcn<x6r> qcnVar = d7rVar.a;
                    ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                    Iterator<x6r> it = qcnVar.iterator();
                    while (it.hasNext()) {
                        x6r next = it.next();
                        String str = next.a;
                        long j = next.d;
                        Calendar calendar = Calendar.getInstance();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTimeInMillis(j);
                        Iterator<x6r> it2 = it;
                        boolean z = calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
                        Date date = new Date(j);
                        if (z) {
                            String str2 = new SimpleDateFormat(" HH:mm", Locale.getDefault()).format(date);
                            str2.getClass();
                            StringUiText stringUiText2 = vch0.a;
                            stringUiText = new ResourceUiText(R.string.common_dates__today).h(new StringUiText(str2));
                        } else {
                            String str3 = new SimpleDateFormat("dd-MM-yyyy\nHH:mm", Locale.getDefault()).format(date);
                            str3.getClass();
                            StringUiText stringUiText3 = vch0.a;
                            stringUiText = new StringUiText(str3);
                        }
                        arrayList.add(new t4r(str, stringUiText, next.h ? u4r.b.a : new u4r.a(next.i)));
                        it = it2;
                    }
                    cVar = new v4r.b.c(a4h.f(arrayList), d7rVar.b);
                }
                aVar.b = 1;
                if (this.a.emit(cVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public e3r(b77 b77Var) {
        this.a = b77Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super v4r> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
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
