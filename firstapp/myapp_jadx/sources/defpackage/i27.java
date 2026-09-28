package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.loyalty.impl.challenge.data.remote.dto.ChallengeIdRequestDto;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class i27 implements c27 {
    public final ix6 a;
    public final wwd0 b;
    public final v340 c;

    public i27(ix6 ix6Var) {
        ix6Var.getClass();
        this.a = ix6Var;
        wwd0 wwd0VarA = xwd0.a(null);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c27
    public final Object a(long j, x1b x1bVar) {
        f27 f27Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof f27) {
            f27Var = (f27) x1bVar;
            int i = f27Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f27Var.d = i - Integer.MIN_VALUE;
            } else {
                f27Var = new f27(this, x1bVar);
            }
        } else {
            f27Var = new f27(this, x1bVar);
        }
        Object obj = f27Var.b;
        y5b y5bVar = y5b.a;
        int i2 = f27Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                ix6 ix6Var = this.a;
                ChallengeIdRequestDto challengeIdRequestDto = new ChallengeIdRequestDto(j);
                f27Var.a = resourceUiText;
                f27Var.d = 1;
                Object objC = ix6Var.c(challengeIdRequestDto, f27Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
                obj = objC;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = f27Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        n52.c((BaseResponse) obj);
        bVar = Unit.a;
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c27
    public final Object b(x1b x1bVar) {
        g27 g27Var;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof g27) {
            g27Var = (g27) x1bVar;
            int i = g27Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g27Var.d = i - Integer.MIN_VALUE;
            } else {
                g27Var = new g27(this, x1bVar);
            }
        } else {
            g27Var = new g27(this, x1bVar);
        }
        Object obj = g27Var.b;
        y5b y5bVar = y5b.a;
        int i2 = g27Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                ix6 ix6Var = this.a;
                g27Var.a = resourceUiText;
                g27Var.d = 1;
                Object objD = ix6Var.d(g27Var);
                if (objD == y5bVar) {
                    return y5bVar;
                }
                obj = objD;
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = g27Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        Iterable iterable = (Iterable) n52.b((BaseResponse) obj);
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(wz6.g((kx6) it.next()));
        }
        zi50.a aVar4 = zi50.b;
        bVar = arrayList;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c27
    public final Object c(long j, x1b x1bVar) {
        h27 h27Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof h27) {
            h27Var = (h27) x1bVar;
            int i = h27Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h27Var.d = i - Integer.MIN_VALUE;
            } else {
                h27Var = new h27(this, x1bVar);
            }
        } else {
            h27Var = new h27(this, x1bVar);
        }
        Object obj = h27Var.b;
        y5b y5bVar = y5b.a;
        int i2 = h27Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                ix6 ix6Var = this.a;
                ChallengeIdRequestDto challengeIdRequestDto = new ChallengeIdRequestDto(j);
                h27Var.a = resourceUiText;
                h27Var.d = 1;
                Object objA = ix6Var.a(challengeIdRequestDto, h27Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                obj = objA;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = h27Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        n52.c((BaseResponse) obj);
        bVar = Unit.a;
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    @Override // defpackage.c27
    public final lyh<kqz<f1s>> d(final long j) {
        return new ymz(new joz(new Function0() { // from class: d27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                i27 i27Var = this.a;
                i27Var.b.setValue(null);
                return new n1s(j, i27Var.a, new e27(i27Var));
            }
        }, null), new iqz(1000, 0, false, 1000, 0, 54), null).e;
    }

    @Override // defpackage.c27
    public final v340 e() {
        return this.c;
    }
}
