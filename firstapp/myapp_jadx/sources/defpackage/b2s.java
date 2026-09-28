package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b2s {
    public final uti a;
    public final psm b;
    public final bnh0 c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChallengeType.values().length];
            try {
                iArr[ChallengeType.TOTAL_WINNING_ODDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChallengeType.TOTAL_WINNING_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChallengeType.HIGHEST_WINNING_AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChallengeType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public b2s(uti utiVar, psm psmVar, bnh0 bnh0Var) {
        psmVar.getClass();
        bnh0Var.getClass();
        this.a = utiVar;
        this.b = psmVar;
        this.c = bnh0Var;
    }

    public static String f(String str) {
        return str.length() <= 8 ? str : tug.a(wae0.K(4, str), "******", wae0.L(4, str));
    }

    public static String g(String str) {
        return str.length() <= 4 ? str : tug.a(wae0.K(2, str), c.o(str.length() - 4, "*"), wae0.L(2, str));
    }

    public static UiText i(String str, String str2, String str3) {
        StringUiText stringUiText = null;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                StringUiText stringUiText2 = vch0.a;
                return new StringUiText(str);
            }
        }
        if (str2 != null) {
            if (StringsKt.U(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                StringUiText stringUiText3 = vch0.a;
                return new StringUiText(str2);
            }
        }
        if (str3 != null) {
            if (StringsKt.U(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                StringUiText stringUiText4 = vch0.a;
                stringUiText = new StringUiText(str3);
            }
        }
        if (stringUiText != null) {
            return stringUiText;
        }
        StringUiText stringUiText5 = vch0.a;
        return new ResourceUiText(R.string.page_loyalty__anonymous);
    }

    public final Object a(ChallengeType challengeType, x1b x1bVar) {
        int i = a.a[challengeType.ordinal()];
        if (i == 1) {
            return "----";
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.a.a("----", this.b.b(), false, x1bVar);
        }
        uhc.a();
        return null;
    }

    public final Object b(double d, ChallengeType challengeType, x1b x1bVar) {
        int i = a.a[challengeType.ordinal()];
        if (i == 1) {
            if (d == 0.0d) {
                return "----";
            }
            String plainString = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).toPlainString();
            plainString.getClass();
            return plainString;
        }
        if (i != 2 && i != 3 && i != 4) {
            uhc.a();
            return null;
        }
        return this.a.a(s5y.e(new Double(d)), this.b.b(), true, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(AccountInfo accountInfo, int i, ChallengeType challengeType, x1b x1bVar) {
        c2s c2sVar;
        String str;
        String str2;
        UiText uiText;
        String str3;
        int i2;
        if (x1bVar instanceof c2s) {
            c2sVar = (c2s) x1bVar;
            int i3 = c2sVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2sVar.v = i3 - Integer.MIN_VALUE;
            } else {
                c2sVar = new c2s(this, x1bVar);
            }
        } else {
            c2sVar = new c2s(this, x1bVar);
        }
        Object obj = c2sVar.f;
        Object obj2 = y5b.a;
        int i4 = c2sVar.v;
        if (i4 == 0) {
            uj50.b(obj);
            String strH = h(accountInfo.getAvatar());
            String nickname = accountInfo.getNickname();
            if (StringsKt.U(nickname)) {
                nickname = null;
            }
            String phone = accountInfo.getPhone();
            if (StringsKt.U(phone)) {
                phone = null;
            }
            String strG = phone != null ? g(phone) : null;
            String email = accountInfo.getEmail();
            if (StringsKt.U(email)) {
                email = null;
            }
            UiText uiTextI = i(nickname, strG, email != null ? f(email) : null);
            int i5 = !StringsKt.U(accountInfo.getNickname()) ? 1 : 0;
            String strF = s5y.f(i);
            c2sVar.a = strH;
            c2sVar.b = uiTextI;
            c2sVar.c = "#----";
            c2sVar.d = strF;
            c2sVar.e = i5;
            c2sVar.v = 1;
            Object objA = a(challengeType, c2sVar);
            if (objA == obj2) {
                return obj2;
            }
            str = strF;
            str2 = strH;
            uiText = uiTextI;
            str3 = "#----";
            obj = objA;
            i2 = i5;
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c2sVar.e;
            String str4 = c2sVar.d;
            String str5 = c2sVar.c;
            UiText uiText2 = c2sVar.b;
            String str6 = c2sVar.a;
            uj50.b(obj);
            str = str4;
            str3 = str5;
            uiText = uiText2;
            str2 = str6;
        }
        return new vph0(str2, uiText, i2 != 0, str3, str, (String) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(f1s f1sVar, ChallengeType challengeType, x1b x1bVar) {
        d2s d2sVar;
        UiText uiTextI;
        int i;
        String str;
        UiText uiText;
        f1s f1sVar2 = f1sVar;
        if (x1bVar instanceof d2s) {
            d2sVar = (d2s) x1bVar;
            int i2 = d2sVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d2sVar.i = i2 - Integer.MIN_VALUE;
            } else {
                d2sVar = new d2s(this, x1bVar);
            }
        } else {
            d2sVar = new d2s(this, x1bVar);
        }
        Object obj = d2sVar.e;
        Object obj2 = y5b.a;
        int i3 = d2sVar.i;
        if (i3 == 0) {
            uj50.b(obj);
            Integer num = f1sVar2.b;
            int iIntValue = num != null ? num.intValue() : 0;
            String strH = h(f1sVar2.g);
            if (f1sVar2.h) {
                StringUiText stringUiText = vch0.a;
                uiTextI = new ResourceUiText(R.string.page_loyalty__challenge_leaderboard_me);
            } else {
                uiTextI = i(f1sVar2.d, f1sVar2.e, f1sVar2.f);
            }
            double d = f1sVar2.c;
            d2sVar.a = f1sVar2;
            d2sVar.b = strH;
            d2sVar.c = uiTextI;
            d2sVar.d = iIntValue;
            d2sVar.i = 1;
            Object objB = b(d, challengeType, d2sVar);
            if (objB == obj2) {
                return obj2;
            }
            i = iIntValue;
            str = strH;
            uiText = uiTextI;
            obj = objB;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = d2sVar.d;
            UiText uiText2 = d2sVar.c;
            String str2 = d2sVar.b;
            f1s f1sVar3 = d2sVar.a;
            uj50.b(obj);
            i = i4;
            uiText = uiText2;
            f1sVar2 = f1sVar3;
            str = str2;
        }
        String str3 = (String) obj;
        boolean z = f1sVar2.h;
        Integer num2 = f1sVar2.b;
        return new h1s(i, uiText, str, str3, z, num2 != null && num2.intValue() == 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object e(f1s f1sVar, AccountInfo accountInfo, boolean z, int i, int i2, ChallengeType challengeType, x1b x1bVar) {
        e2s e2sVar;
        String nickname;
        String phone;
        String email;
        String strA;
        int i3;
        UiText uiText;
        String str;
        String str2;
        String str3;
        String str4;
        if (x1bVar instanceof e2s) {
            e2sVar = (e2s) x1bVar;
            int i4 = e2sVar.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                e2sVar.v = i4 - Integer.MIN_VALUE;
            } else {
                e2sVar = new e2s(this, x1bVar);
            }
        } else {
            e2sVar = new e2s(this, x1bVar);
        }
        Object obj = e2sVar.f;
        Object obj2 = y5b.a;
        int i5 = e2sVar.v;
        if (i5 == 0) {
            uj50.b(obj);
            if (accountInfo == null || (nickname = accountInfo.getNickname()) == null || StringsKt.U(nickname)) {
                nickname = null;
            }
            if (accountInfo == null || (phone = accountInfo.getPhone()) == null || StringsKt.U(phone)) {
                phone = null;
            }
            if (accountInfo == null || (email = accountInfo.getEmail()) == null || StringsKt.U(email)) {
                email = null;
            }
            String strH = h(accountInfo != null ? accountInfo.getAvatar() : null);
            String str5 = f1sVar.g;
            String str6 = f1sVar.d;
            String strH2 = h(str5);
            if (strH2 != null) {
                strH = strH2;
            }
            String str7 = nickname == null ? str6 : nickname;
            String str8 = f1sVar.e;
            if (str8 != null) {
                phone = str8;
            }
            String strG = phone != null ? g(phone) : null;
            String str9 = f1sVar.f;
            if (str9 != null) {
                email = str9;
            }
            UiText uiTextI = i(str7, strG, email != null ? f(email) : null);
            int i6 = (nickname == null && (str6 == null || StringsKt.U(str6))) ? 0 : 1;
            Integer num = f1sVar.b;
            if (z) {
                strA = "#----";
            } else if (num == null) {
                strA = tug.a("#", s5y.f(i2), "+");
            } else {
                strA = "#" + num;
            }
            String strF = s5y.f(i);
            if (z) {
                e2sVar.a = strH;
                e2sVar.b = uiTextI;
                e2sVar.c = strA;
                e2sVar.d = strF;
                e2sVar.e = i6;
                e2sVar.v = 1;
                Object objA = a(challengeType, e2sVar);
                if (objA != obj2) {
                    int i7 = i6;
                    obj = objA;
                    i3 = i7;
                    uiText = uiTextI;
                    str = strA;
                    str2 = strF;
                    str3 = strH;
                    str4 = (String) obj;
                }
            } else {
                double d = f1sVar.c;
                e2sVar.a = strH;
                e2sVar.b = uiTextI;
                e2sVar.c = strA;
                e2sVar.d = strF;
                e2sVar.e = i6;
                e2sVar.v = 2;
                Object objB = b(d, challengeType, e2sVar);
                if (objB != obj2) {
                    int i8 = i6;
                    obj = objB;
                    i3 = i8;
                    uiText = uiTextI;
                    str = strA;
                    str2 = strF;
                    str3 = strH;
                    str4 = (String) obj;
                }
            }
            return obj2;
        }
        if (i5 == 1) {
            i3 = e2sVar.e;
            str2 = e2sVar.d;
            str = e2sVar.c;
            uiText = e2sVar.b;
            str3 = e2sVar.a;
            uj50.b(obj);
            str4 = (String) obj;
        } else {
            if (i5 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = e2sVar.e;
            str2 = e2sVar.d;
            str = e2sVar.c;
            uiText = e2sVar.b;
            str3 = e2sVar.a;
            uj50.b(obj);
            str4 = (String) obj;
        }
        return new vph0(str3, uiText, i3 != 0, str, str2, str4);
    }

    public final String h(String str) {
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                return this.c.e(str);
            }
        }
        return null;
    }
}
