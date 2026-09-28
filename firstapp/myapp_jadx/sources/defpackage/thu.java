package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.Country;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class thu {
    public final int a;
    public final String b;
    public final String c;
    public final ijf0 d;
    public final ijf0 e;
    public final qcn<Country> f;
    public final Country g;
    public final Long h;
    public final ijf0 i;
    public final UiText j;
    public final ijf0 k;
    public final UiText l;
    public final dwz m;
    public final iej n;
    public final uxs o;
    public final sx40 p;

    public thu(int i, String str, String str2, ijf0 ijf0Var, ijf0 ijf0Var2, qcn<Country> qcnVar, Country country, Long l, ijf0 ijf0Var3, UiText uiText, ijf0 ijf0Var4, UiText uiText2, dwz dwzVar, iej iejVar, uxs uxsVar, sx40 sx40Var) {
        str.getClass();
        str2.getClass();
        qcnVar.getClass();
        iejVar.getClass();
        uxsVar.getClass();
        sx40Var.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = ijf0Var;
        this.e = ijf0Var2;
        this.f = qcnVar;
        this.g = country;
        this.h = l;
        this.i = ijf0Var3;
        this.j = uiText;
        this.k = ijf0Var4;
        this.l = uiText2;
        this.m = dwzVar;
        this.n = iejVar;
        this.o = uxsVar;
        this.p = sx40Var;
        uxs uxsVar2 = uxs.ENABLE;
    }

    public static thu a(thu thuVar, ijf0 ijf0Var, ijf0 ijf0Var2, qcn qcnVar, Country country, Long l, ijf0 ijf0Var3, ResourceUiText resourceUiText, ijf0 ijf0Var4, dwz dwzVar, uxs uxsVar, sx40 sx40Var, int i) {
        int i2 = thuVar.a;
        String str = thuVar.b;
        String str2 = thuVar.c;
        ijf0 ijf0Var5 = (i & 8) != 0 ? thuVar.d : ijf0Var;
        ijf0 ijf0Var6 = (i & 16) != 0 ? thuVar.e : ijf0Var2;
        qcn qcnVar2 = (i & 32) != 0 ? thuVar.f : qcnVar;
        Country country2 = (i & 64) != 0 ? thuVar.g : country;
        Long l2 = (i & 128) != 0 ? thuVar.h : l;
        ijf0 ijf0Var7 = (i & 256) != 0 ? thuVar.i : ijf0Var3;
        UiText uiText = (i & 512) != 0 ? thuVar.j : resourceUiText;
        ijf0 ijf0Var8 = (i & 1024) != 0 ? thuVar.k : ijf0Var4;
        UiText uiText2 = (i & 2048) != 0 ? thuVar.l : null;
        dwz dwzVar2 = (i & 4096) != 0 ? thuVar.m : dwzVar;
        iej iejVar = thuVar.n;
        uxs uxsVar2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? thuVar.o : uxsVar;
        sx40 sx40Var2 = (i & 32768) != 0 ? thuVar.p : sx40Var;
        thuVar.getClass();
        str.getClass();
        str2.getClass();
        qcnVar2.getClass();
        iejVar.getClass();
        uxsVar2.getClass();
        sx40Var2.getClass();
        return new thu(i2, str, str2, ijf0Var5, ijf0Var6, qcnVar2, country2, l2, ijf0Var7, uiText, ijf0Var8, uiText2, dwzVar2, iejVar, uxsVar2, sx40Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thu)) {
            return false;
        }
        thu thuVar = (thu) obj;
        return this.a == thuVar.a && Intrinsics.g(this.b, thuVar.b) && Intrinsics.g(this.c, thuVar.c) && this.d.equals(thuVar.d) && this.e.equals(thuVar.e) && Intrinsics.g(this.f, thuVar.f) && Intrinsics.g(this.g, thuVar.g) && Intrinsics.g(this.h, thuVar.h) && this.i.equals(thuVar.i) && Intrinsics.g(this.j, thuVar.j) && this.k.equals(thuVar.k) && Intrinsics.g(this.l, thuVar.l) && this.m.equals(thuVar.m) && Intrinsics.g(this.n, thuVar.n) && this.o == thuVar.o && Intrinsics.g(this.p, thuVar.p);
    }

    public final int hashCode() {
        int iA = shu.a(this.f, ey1.b(this.e, ey1.b(this.d, gmf0.a(gmf0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31);
        Country country = this.g;
        int iHashCode = (iA + (country == null ? 0 : country.hashCode())) * 31;
        Long l = this.h;
        int iB = ey1.b(this.i, (iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31);
        UiText uiText = this.j;
        int iB2 = ey1.b(this.k, (iB + (uiText == null ? 0 : uiText.hashCode())) * 31, 31);
        UiText uiText2 = this.l;
        return this.p.hashCode() + y45.a(this.o, (this.n.hashCode() + ((this.m.hashCode() + ((iB2 + (uiText2 != null ? uiText2.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "MZRegisterUIState(countryFlag=", ", countryName=", this.b, ", callingCode=");
        sbA.append(this.c);
        sbA.append(", firstNameValue=");
        sbA.append(this.d);
        sbA.append(", lastNameValue=");
        sbA.append(this.e);
        sbA.append(", availableCitizenships=");
        sbA.append(this.f);
        sbA.append(", selectedCitizenship=");
        sbA.append(this.g);
        sbA.append(", dateOfBirth=");
        sbA.append(this.h);
        sbA.append(", phoneNumberValue=");
        sbA.append(this.i);
        sbA.append(", phoneNumberError=");
        sbA.append(this.j);
        sbA.append(", passwordValue=");
        sbA.append(this.k);
        sbA.append(", passwordError=");
        sbA.append(this.l);
        sbA.append(", passwordStatus=");
        sbA.append(this.m);
        sbA.append(", gpInfo=");
        sbA.append(this.n);
        sbA.append(", submitButtonStatus=");
        sbA.append(this.o);
        sbA.append(", submitData=");
        sbA.append(this.p);
        sbA.append(")");
        return sbA.toString();
    }
}
