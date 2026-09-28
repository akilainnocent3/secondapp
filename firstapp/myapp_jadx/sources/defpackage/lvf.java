package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llvf;", "Lavw;", "Lkvf;", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class lvf extends avw<kvf> {
    public final mgb0 e;
    public final uga0 f;
    public final ogk i;
    public final cb v;
    public jvd0 w;

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("AvailabilityQuery(username=", this.a, ", isFormatValid=", ")", this.b);
        }
    }

    @c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel", f = "EditUsernameViewModel.kt", l = {141}, m = "handleUpdateResult", v = 2)
    public static final class b extends x1b {
        public String a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lvf c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, lvf lvfVar) {
            super(v1bVar);
            this.c = lvfVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.z1(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvf(mgb0 mgb0Var, uga0 uga0Var, ogk ogkVar, cb cbVar) {
        String nickname;
        super(new kvf(null, null, 255));
        mgb0Var.getClass();
        cbVar.getClass();
        this.e = mgb0Var;
        this.f = uga0Var;
        this.i = ogkVar;
        this.v = cbVar;
        AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
        if (accountInfoLastAccountInfo != null && (nickname = accountInfoLastAccountInfo.getNickname()) != null) {
            A1(nickname);
        }
        ej5.c(o8i0.d(this), null, null, new nvf(null, this), 3);
    }

    public final void A1(String str) {
        wwd0 wwd0Var;
        Object value;
        int length;
        str.getClass();
        Locale locale = Locale.US;
        String strA = gvf.a(locale, str, locale);
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            length = strA.length();
        } while (!wwd0Var.g(value, new kvf(strA, new ijf0(strA, vlf0.a(length, length), 4), 252)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(nsx nsxVar, String str, v1b<? super Unit> v1bVar) {
        b bVar;
        Object value;
        kqh0 kqh0Var;
        Object value2;
        kqh0 kqh0Var2;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.d = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(v1bVar, this);
            }
        } else {
            bVar = new b(v1bVar, this);
        }
        Object obj = bVar.b;
        y5b y5bVar = y5b.a;
        int i2 = bVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (Intrinsics.g(nsxVar, nsx.e.a)) {
                bVar.a = str;
                bVar.d = 1;
                if (this.e.reloadAccountInfo(bVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                boolean zG = Intrinsics.g(nsxVar, nsx.f.a);
                wwd0 wwd0Var = this.a;
                if (zG) {
                    do {
                        value2 = wwd0Var.getValue();
                        kqh0Var2 = kqh0.d;
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var.g(value2, kvf.a((kvf) value2, null, false, false, kqh0Var2, new ResourceUiText(R.string.personal_page__username_already_taken_inline), null, 0, 207)));
                    x1(jvf.d.a);
                } else if (Intrinsics.g(nsxVar, nsx.d.a)) {
                    do {
                        value = wwd0Var.getValue();
                        kqh0Var = kqh0.e;
                        StringUiText stringUiText2 = vch0.a;
                    } while (!wwd0Var.g(value, kvf.a((kvf) value, null, false, false, kqh0Var, new ResourceUiText(R.string.personal_page__username_contains_restricted_words_inline), null, 0, 207)));
                    x1(jvf.c.a);
                } else if (Intrinsics.g(nsxVar, nsx.a.a)) {
                    x1(jvf.a.a);
                } else {
                    if (!Intrinsics.g(nsxVar, nsx.g.a) && !Intrinsics.g(nsxVar, nsx.c.a) && !Intrinsics.g(nsxVar, nsx.b.a)) {
                        uhc.a();
                        return null;
                    }
                    x1(jvf.f.a);
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = bVar.a;
        uj50.b(obj);
        x1(new jvf.e(str));
        return Unit.a;
    }
}
