package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$loadList$1", f = "SocialNetworkSuggestedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lfa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ kfa0 a;
    public final /* synthetic */ ijf0 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xia0.values().length];
            try {
                xia0 xia0Var = xia0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                xia0 xia0Var2 = xia0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfa0(kfa0 kfa0Var, ijf0 ijf0Var, v1b<? super lfa0> v1bVar) {
        super(2, v1bVar);
        this.a = kfa0Var;
        this.b = ijf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lfa0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((lfa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ijf0 ijf0Var = this.b;
        nk0 nk0Var = ijf0Var.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        kfa0 kfa0Var = this.a;
        wwd0 wwd0Var = kfa0Var.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, jfa0.a((jfa0) value, null, ijf0Var, false, 0, 29)));
        xia0 type = kfa0Var.v.getType();
        int i = type == null ? -1 : a.a[type.ordinal()];
        if (i == 1) {
            kfa0Var.y1(new nfa0(kfa0Var, nk0Var.b, null));
        } else if (i != 2) {
            kfa0Var.y1(new mfa0(kfa0Var, nk0Var.b, null));
        } else {
            kfa0Var.y1(new mfa0(kfa0Var, nk0Var.b, null));
        }
        return Unit.a;
    }
}
