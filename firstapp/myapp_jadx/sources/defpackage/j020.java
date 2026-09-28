package defpackage;

import android.text.Spanned;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;
import com.google.protobuf.Reader;
import java.text.BreakIterator;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class j020 {
    public static final t90 a = new t90(1000);
    public static final t90 b;
    public static final t90 c;

    static {
        new t90(1007);
        b = new t90(1008);
        c = new t90(1002);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.emoji2.text.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    public static final int a(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        d dVarD = d();
        Integer num = null;
        if (dVarD != null) {
            km20.g("Not initialized yet", dVarD.c() == 1);
            km20.f(str, "charSequence cannot be null");
            ?? r4 = dVarD.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                j1g[] j1gVarArr = (j1g[]) spanned.getSpans(i, i + 1, j1g.class);
                if (j1gVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(j1gVarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((f.c) r4.d(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Reader.READ_DONE, true, new f.c(i))).c;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((f.c) r4.d(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Reader.READ_DONE, true, new f.c(i))).c;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int b(int i, String str) {
        d dVarD = d();
        Integer num = null;
        if (dVarD != null) {
            Integer numValueOf = Integer.valueOf(dVarD.b(Math.max(0, i - 1), str));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final long c(int i) {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(7) - 1;
        int i3 = i2 != 0 ? i2 : 7;
        if (i < i3) {
            i += 7;
        }
        calendar.add(5, (-i3) + i);
        yt5.e(calendar);
        return calendar.getTimeInMillis();
    }

    public static final d d() {
        if (!d.d()) {
            return null;
        }
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return dVarA;
        }
        return null;
    }
}
