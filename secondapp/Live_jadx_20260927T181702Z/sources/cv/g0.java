package cv;

import dr.g1;
import dr.l1;
import java.io.IOException;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
public class g0 extends f0 {
    @l1(version = "1.9")
    @ur.f
    public static final StringBuilder C(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) b10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return sb2;
    }

    @l1(version = "1.9")
    @ur.f
    public static final StringBuilder D(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) s10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder E(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) b10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder F(StringBuilder sb2, double d10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(d10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder G(StringBuilder sb2, float f10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(f10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder H(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(i10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder I(StringBuilder sb2, long j10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(j10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder J(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder K(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder L(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) s10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder M(StringBuilder sb2, CharSequence value, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        sb2.append(value, i10, i11);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder N(StringBuilder sb2, char[] value, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        sb2.append(value, i10, i11 - i10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return sb2;
    }

    @oy.l
    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine()", imports = {}))
    public static final Appendable O(@oy.l Appendable appendable) throws IOException {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(x0.f77335b);
        kotlin.jvm.internal.m0.o(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final Appendable P(Appendable appendable, char c10) throws IOException {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        kotlin.jvm.internal.m0.o(appendableAppend, "append(...)");
        return O(appendableAppend);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final Appendable Q(Appendable appendable, CharSequence charSequence) throws IOException {
        kotlin.jvm.internal.m0.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        kotlin.jvm.internal.m0.o(appendableAppend, "append(...)");
        return O(appendableAppend);
    }

    @oy.l
    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine()", imports = {}))
    public static final StringBuilder R(@oy.l StringBuilder sb2) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(x0.f77335b);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return sb2;
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder S(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) b10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder T(StringBuilder sb2, char c10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(c10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder U(StringBuilder sb2, double d10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(d10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder V(StringBuilder sb2, float f10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(f10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder W(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(i10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder X(StringBuilder sb2, long j10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(j10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder Y(StringBuilder sb2, CharSequence charSequence) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(charSequence);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder Z(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(obj);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder a0(StringBuilder sb2, String str) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(str);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder b0(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder c0(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder d0(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append((int) s10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder e0(StringBuilder sb2, boolean z10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.append(z10);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @dr.p(errorSince = "2.1", warningSince = sc.k.f129877g)
    @ur.f
    @dr.o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @g1(expression = "appendLine(value)", imports = {}))
    public static final StringBuilder f0(StringBuilder sb2, char[] value) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        sb2.append(value);
        kotlin.jvm.internal.m0.o(sb2, "append(...)");
        return R(sb2);
    }

    @oy.l
    @l1(version = "1.3")
    public static StringBuilder g0(@oy.l StringBuilder sb2) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder h0(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        StringBuilder sbDeleteCharAt = sb2.deleteCharAt(i10);
        kotlin.jvm.internal.m0.o(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder i0(StringBuilder sb2, int i10, int i11) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        StringBuilder sbDelete = sb2.delete(i10, i11);
        kotlin.jvm.internal.m0.o(sbDelete, "delete(...)");
        return sbDelete;
    }

    @l1(version = "1.9")
    @ur.f
    public static final StringBuilder j0(StringBuilder sb2, int i10, byte b10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) b10);
        kotlin.jvm.internal.m0.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @l1(version = "1.9")
    @ur.f
    public static final StringBuilder k0(StringBuilder sb2, int i10, short s10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) s10);
        kotlin.jvm.internal.m0.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder l0(StringBuilder sb2, int i10, CharSequence value, int i11, int i12) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12);
        kotlin.jvm.internal.m0.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder m0(StringBuilder sb2, int i10, char[] value, int i11, int i12) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12 - i11);
        kotlin.jvm.internal.m0.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @ur.f
    public static final void n0(StringBuilder sb2, int i10, char c10) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final StringBuilder o0(StringBuilder sb2, int i10, int i11, String value) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(value, "value");
        StringBuilder sbReplace = sb2.replace(i10, i11, value);
        kotlin.jvm.internal.m0.o(sbReplace, "replace(...)");
        return sbReplace;
    }

    @l1(version = sc.k.f129877g)
    @ur.f
    public static final void p0(StringBuilder sb2, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    public static /* synthetic */ void q0(StringBuilder sb2, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        kotlin.jvm.internal.m0.p(sb2, "<this>");
        kotlin.jvm.internal.m0.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }
}
