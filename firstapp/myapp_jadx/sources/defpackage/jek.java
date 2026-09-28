package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class jek {
    public final wdd0 a;
    public final mgb0 b;
    public final bnh0 c;

    public jek(wdd0 wdd0Var, mgb0 mgb0Var, bnh0 bnh0Var) {
        wdd0Var.getClass();
        mgb0Var.getClass();
        bnh0Var.getClass();
        this.a = wdd0Var;
        this.b = mgb0Var;
        this.c = bnh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(x1b x1bVar) {
        iek iekVar;
        UiText uiText;
        UiText uiText2;
        String str;
        Object bVar;
        Object obj;
        Throwable thA;
        Throwable thA2;
        fk50 fk50Var;
        UiText text;
        if (x1bVar instanceof iek) {
            iekVar = (iek) x1bVar;
            int i = iekVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iekVar.e = i - Integer.MIN_VALUE;
            } else {
                iekVar = new iek(this, x1bVar);
            }
        } else {
            iekVar = new iek(this, x1bVar);
        }
        Object obj2 = iekVar.c;
        y5b y5bVar = y5b.a;
        int i2 = iekVar.e;
        if (i2 == 0) {
            uj50.b(obj2);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                wdd0 wdd0Var = this.a;
                iekVar.a = resourceUiText;
                iekVar.e = 1;
                Object objA = wdd0Var.a(iekVar);
                if (objA != y5bVar) {
                    uiText2 = resourceUiText;
                    obj2 = objA;
                }
                return y5bVar;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = iekVar.b;
                uiText = iekVar.a;
                try {
                    uj50.b(obj2);
                    bVar = String.format(this.c.b("home").concat("?utm_source=sporty_bet&utm_medium=android&utm_content=world_cup_login&authCode=%s&userId=%s&showLogin=true"), Arrays.copyOf(new Object[]{str, (String) obj2}, 2));
                    zi50.a aVar3 = zi50.b;
                } catch (Throwable th2) {
                    th = th2;
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    obj = null;
                } else {
                    obj = bVar;
                }
                if (obj != null) {
                    return new lk50.c(obj);
                }
                thA = zi50.a(bVar);
                if (thA == null) {
                    thA = new Throwable("Unknown error");
                }
                thA2 = zi50.a(bVar);
                if (thA2 != null) {
                    fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
                    if (fk50Var != null && (text = fk50Var.getText()) != null) {
                        uiText = text;
                    }
                }
                return new lk50.a(thA, uiText);
            }
            uiText2 = iekVar.a;
            try {
                uj50.b(obj2);
            } catch (Throwable th3) {
                th = th3;
                uiText = uiText2;
                zi50.a aVar5 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        String str2 = (String) obj2;
        mgb0 mgb0Var = this.b;
        iekVar.a = uiText2;
        iekVar.b = str2;
        iekVar.e = 2;
        Object userId = mgb0Var.getUserId(iekVar);
        if (userId != y5bVar) {
            str = str2;
            obj2 = userId;
            uiText = uiText2;
            bVar = String.format(this.c.b("home").concat("?utm_source=sporty_bet&utm_medium=android&utm_content=world_cup_login&authCode=%s&userId=%s&showLogin=true"), Arrays.copyOf(new Object[]{str, (String) obj2}, 2));
            zi50.a aVar6 = zi50.b;
            if (bVar instanceof zi50.b) {
                obj = null;
            } else {
                obj = bVar;
            }
            if (obj != null) {
                return new lk50.c(obj);
            }
            thA = zi50.a(bVar);
            if (thA == null) {
                thA = new Throwable("Unknown error");
            }
            thA2 = zi50.a(bVar);
            if (thA2 != null) {
                fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
                if (fk50Var != null) {
                    uiText = text;
                }
            }
            return new lk50.a(thA, uiText);
        }
        return y5bVar;
    }
}
