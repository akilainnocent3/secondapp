package okhttp3.internal.idn;

import com.appsflyer.internal.m;
import defpackage.bc5;
import defpackage.fa30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/idn/IdnaMappingTable;", "", "", "sections", "ranges", "mappings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "codePoint", "Lbc5;", "sink", "", "map", "(ILbc5;)Z", "a", "Ljava/lang/String;", "getSections", "()Ljava/lang/String;", "b", "getRanges", "c", "getMappings", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdnaMappingTable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String sections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String ranges;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String mappings;

    public IdnaMappingTable(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.sections = str;
        this.ranges = str2;
        this.mappings = str3;
    }

    public final String getMappings() {
        return this.mappings;
    }

    public final String getRanges() {
        return this.ranges;
    }

    public final String getSections() {
        return this.sections;
    }

    public final boolean map(int codePoint, bc5 sink) {
        int i;
        int i2;
        sink.getClass();
        int i3 = (2097024 & codePoint) >> 7;
        String str = this.sections;
        int length = (str.length() / 4) - 1;
        int i4 = 0;
        while (true) {
            if (i4 > length) {
                i = (-i4) - 1;
                break;
            }
            i = (i4 + length) / 2;
            int iH = Intrinsics.h(i3, IdnaMappingTableKt.read14BitInt(str, i * 4));
            if (iH >= 0) {
                if (iH <= 0) {
                    break;
                }
                i4 = i + 1;
            } else {
                length = i - 1;
            }
        }
        int i5 = i >= 0 ? i * 4 : ((-i) - 2) * 4;
        int i6 = IdnaMappingTableKt.read14BitInt(str, i5 + 2);
        int i7 = i5 + 4;
        int length2 = str.length();
        String str2 = this.ranges;
        int length3 = i7 < length2 ? IdnaMappingTableKt.read14BitInt(str, i5 + 6) : str2.length() / 4;
        int i8 = codePoint & 127;
        int i9 = length3 - 1;
        while (true) {
            if (i6 > i9) {
                i2 = (-i6) - 1;
                break;
            }
            i2 = (i6 + i9) / 2;
            int iH2 = Intrinsics.h(i8, str2.charAt(i2 * 4));
            if (iH2 >= 0) {
                if (iH2 <= 0) {
                    break;
                }
                i6 = i2 + 1;
            } else {
                i9 = i2 - 1;
            }
        }
        int i10 = i2 >= 0 ? i2 * 4 : ((-i2) - 2) * 4;
        char cCharAt = str2.charAt(i10 + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i11 = IdnaMappingTableKt.read14BitInt(str2, i10 + 2);
            sink.n1(i11, cCharAt + i11, this.mappings);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.B(codePoint - (((str2.charAt(i10 + 2) << 7) | ((cCharAt & 15) << 14)) | str2.charAt(i10 + 3)));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.B(codePoint + ((str2.charAt(i10 + 2) << 7) | ((cCharAt & 15) << 14) | str2.charAt(i10 + 3)));
            return true;
        }
        if (cCharAt == 'w') {
            Unit unit = Unit.a;
            return true;
        }
        if (cCharAt == 'x') {
            sink.B(codePoint);
            return true;
        }
        if (cCharAt == 'y') {
            sink.B(codePoint);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(str2.charAt(i10 + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(str2.charAt(i10 + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(str2.charAt(i10 + 2));
            sink.writeByte(str2.charAt(i10 + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(str2.charAt(i10 + 2) | 128);
            sink.writeByte(str2.charAt(i10 + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(str2.charAt(i10 + 2));
            sink.writeByte(str2.charAt(i10 + 3) | 128);
            return true;
        }
        if (cCharAt != 127) {
            fa30.a(codePoint, "unexpected rangesIndex for ");
            return false;
        }
        sink.writeByte(str2.charAt(i10 + 2) | 128);
        sink.writeByte(str2.charAt(i10 + 3) | 128);
        return true;
    }
}
