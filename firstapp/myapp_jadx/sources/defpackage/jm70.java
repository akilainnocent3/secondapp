package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class jm70 implements lyh<xro> {
    public final /* synthetic */ b77 a;
    public final /* synthetic */ mm70 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballWinningDialogHandlerImpl$init$$inlined$mapNotNull$1", f = "ScheduledFootballWinningDialogHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return jm70.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ mm70 b;

        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballWinningDialogHandlerImpl$init$$inlined$mapNotNull$1$2", f = "ScheduledFootballWinningDialogHandlerImpl.kt", l = {52}, m = "emit", v = 2)
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

        public b(myh myhVar, mm70 mm70Var) {
            this.a = myhVar;
            this.b = mm70Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            xro xroVar = null;
            if (i2 == 0) {
                uj50.b(obj2);
                nm70 nm70Var = (nm70) obj;
                if (nm70Var != null) {
                    String str = nm70Var.c + " " + bjb0.L(nm70Var.d, Locale.US);
                    Integer numC = this.b.b.c(nm70Var.a);
                    int iIntValue = numC != null ? numC.intValue() : R.string.common_functions__unknown;
                    StringUiText stringUiText = vch0.a;
                    Iterator<T> it = kotlin.collections.b.k(new ResourceUiText(R.string.common_dates__from), new StringUiText(" "), new ResourceUiText(iIntValue)).iterator();
                    if (!it.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    T next = it.next();
                    while (it.hasNext()) {
                        next = (T) next.h((UiText) it.next());
                    }
                    xroVar = new xro(str, next, false, new gro.b(nm70Var.b));
                }
                if (xroVar != null) {
                    aVar.b = 1;
                    if (this.a.emit(xroVar, aVar) == y5bVar) {
                        return y5bVar;
                    }
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

    public jm70(b77 b77Var, mm70 mm70Var) {
        this.a = b77Var;
        this.b = mm70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super xro> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
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
