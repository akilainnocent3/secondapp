package uw;

import dr.w2;
import fx.m;
import java.io.IOException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nIdnaMappingTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTable\n+ 2 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTableKt\n*L\n1#1,286:1\n272#2,13:287\n272#2,13:300\n*S KotlinDebug\n*F\n+ 1 IdnaMappingTable.kt\nokhttp3/internal/idn/IdnaMappingTable\n*L\n209#1:287,13\n237#1:300,13\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final String f139788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final String f139789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final String f139790c;

    public a(@l String sections, @l String ranges, @l String mappings) {
        m0.p(sections, "sections");
        m0.p(ranges, "ranges");
        m0.p(mappings, "mappings");
        this.f139788a = sections;
        this.f139789b = ranges;
        this.f139790c = mappings;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    public final int a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & 127;
        int i15 = i12 - 1;
        while (i11 <= i15) {
            i13 = (i11 + i15) / 2;
            int iT = m0.t(i14, this.f139789b.charAt(i13 * 4));
            if (iT < 0) {
                i15 = i13 - 1;
            } else {
                if (iT <= 0) {
                    return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
                }
                i11 = i13 + 1;
            }
        }
        i13 = (-i11) - 1;
        if (i13 >= 0) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    public final int b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f139788a.length() / 4) - 1;
        int i13 = 0;
        while (i13 <= length) {
            i11 = (i13 + length) / 2;
            int iT = m0.t(i12, c.b(this.f139788a, i11 * 4));
            if (iT < 0) {
                length = i11 - 1;
            } else {
                if (iT <= 0) {
                    return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
                }
                i13 = i11 + 1;
            }
        }
        i11 = (-i13) - 1;
        if (i11 >= 0) {
        }
    }

    @l
    public final String c() {
        return this.f139790c;
    }

    @l
    public final String d() {
        return this.f139789b;
    }

    @l
    public final String e() {
        return this.f139788a;
    }

    public final boolean f(int i10, @l m sink) throws IOException {
        m0.p(sink, "sink");
        int iB = b(i10);
        int iA = a(i10, c.b(this.f139788a, iB + 2), iB + 4 < this.f139788a.length() ? c.b(this.f139788a, iB + 6) : this.f139789b.length() / 4);
        char cCharAt = this.f139789b.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iB2 = c.b(this.f139789b, iA + 2);
            sink.writeUtf8(this.f139790c, iB2, cCharAt + iB2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.writeUtf8CodePoint(i10 - (this.f139789b.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.f139789b.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.writeUtf8CodePoint(i10 + (this.f139789b.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.f139789b.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            w2 w2Var = w2.f79517a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.writeUtf8CodePoint(i10);
            return true;
        }
        if (cCharAt == 'y') {
            sink.writeUtf8CodePoint(i10);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.f139789b.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.f139789b.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.f139789b.charAt(iA + 2));
            sink.writeByte(this.f139789b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.f139789b.charAt(iA + 2) | 128);
            sink.writeByte(this.f139789b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.f139789b.charAt(iA + 2));
            sink.writeByte(this.f139789b.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.f139789b.charAt(iA + 2) | 128);
            sink.writeByte(this.f139789b.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
