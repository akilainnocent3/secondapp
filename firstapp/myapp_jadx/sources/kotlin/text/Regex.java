package kotlin.text;

import defpackage.efe0;
import defpackage.ks40;
import defpackage.ms40;
import defpackage.n8v;
import defpackage.ns40;
import defpackage.q1k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Pattern a;

    /* JADX INFO: renamed from: kotlin.text.Regex$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Regex(String str, ns40 ns40Var) {
        str.getClass();
        ns40Var.getClass();
        Companion companion = INSTANCE;
        int i = ns40Var.a;
        companion.getClass();
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.a = patternCompile;
    }

    public static q1k c(final Regex regex, final CharSequence charSequence) {
        regex.getClass();
        charSequence.getClass();
        if (charSequence.length() < 0) {
            ks40.a(charSequence.length(), efe0.a(0, "Start index out of bounds: ", ", input length: "));
            return null;
        }
        Function0 function0 = new Function0() { // from class: ls40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Regex.Companion companion = Regex.INSTANCE;
                return this.a.b(charSequence);
            }
        };
        ms40 ms40Var = ms40.a;
        ms40Var.getClass();
        return new q1k(function0, ms40Var);
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final n8v b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new n8v(matcher, charSequence);
        }
        return null;
    }

    public final n8v d(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new n8v(matcherRegion, str);
        }
        return null;
    }

    public final n8v e(String str) {
        str.getClass();
        Matcher matcher = this.a.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new n8v(matcher, str);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String g(String str, Function1 function1) {
        str.getClass();
        n8v n8vVarB = b(str);
        if (n8vVarB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, n8vVarB.b().a);
            sb.append((CharSequence) function1.invoke(n8vVarB));
            i = n8vVarB.b().b + 1;
            n8vVarB = n8vVarB.next();
            if (i >= length) {
                break;
            }
        } while (n8vVarB != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List h(CharSequence charSequence) {
        charSequence.getClass();
        int iEnd = 0;
        StringsKt__StringsKt.A(0);
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return kotlin.collections.a.c(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceAll = this.a.matcher(input).replaceAll(replacement);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public Regex(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        patternCompile.getClass();
        this.a = patternCompile;
    }
}
