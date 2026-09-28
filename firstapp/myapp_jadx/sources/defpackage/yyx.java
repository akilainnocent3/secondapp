package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class yyx {
    public static final yyx d = new yyx(0);
    public final String a;
    public final int b;
    public final List<String> c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public yyx(String str, int i) {
        this.a = str;
        this.b = i;
        this.c = StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null);
    }

    public final String a() {
        List<String> list = this.c;
        return list.size() > 1 ? list.get(1) : "";
    }

    public final boolean b() {
        Object bVar;
        String str = this.a;
        if (str.length() == 0) {
            return false;
        }
        if (str.length() < 5) {
            return true;
        }
        try {
            zi50.a aVar = zi50.b;
            bVar = Boolean.valueOf(y2c.a(a(), this.c.get(0)));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.o(thA);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Boolean bool = (Boolean) bVar;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyx)) {
            return false;
        }
        yyx yyxVar = (yyx) obj;
        return Intrinsics.g(this.a, yyxVar.a) && this.b == yyxVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "NormalizedCardExpiration(normalizedCardExpiration=", this.a, ", selectionIndex=", ")");
    }

    public yyx() {
        this(0);
    }

    public /* synthetic */ yyx(int i) {
        this("", 0);
    }
}
