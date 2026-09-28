package okhttp3.internal.publicsuffix;

import defpackage.kb5;
import defpackage.ld80;
import defpackage.m2g;
import defpackage.pe4;
import defpackage.ref;
import defpackage.rl5;
import defpackage.zef;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "publicSuffixList", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "", "domain", "getEffectiveTldPlusOne", "(Ljava/lang/String;)Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final rl5 b;
    public static final List<String> c;
    public static PublicSuffixDatabase d;
    public final PublicSuffixList a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "resetForTests$okhttp", "resetForTests", "Lrl5;", "WILDCARD_LABEL", "Lrl5;", "", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final String access$binarySearch(Companion companion, rl5 rl5Var, rl5[] rl5VarArr, int i) {
            int i2;
            int iAnd;
            boolean z;
            int iAnd2;
            companion.getClass();
            int iD = rl5Var.d();
            int i3 = 0;
            while (i3 < iD) {
                int i4 = (i3 + iD) / 2;
                while (i4 > -1 && rl5Var.j(i4) != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (rl5Var.j(i2) == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        iAnd = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        iAnd = _UtilCommonKt.and(rl5VarArr[i8].j(i9), 255);
                        z = z3;
                    }
                    iAnd2 = iAnd - _UtilCommonKt.and(rl5Var.j(i5 + i10), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (rl5VarArr[i8].d() != i9) {
                        z2 = z;
                    } else {
                        if (i8 == rl5VarArr.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i11 = i7 - i10;
                        int iD2 = rl5VarArr[i8].d() - i9;
                        int length = rl5VarArr.length;
                        for (int i12 = i8 + 1; i12 < length; i12++) {
                            iD2 += rl5VarArr[i12].d();
                        }
                        if (iD2 >= i11) {
                            if (iD2 <= i11) {
                                return rl5Var.p(i5, i7 + i5).o(Charsets.UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                iD = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.d;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.d = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
        }

        private Companion() {
        }
    }

    static {
        rl5 rl5Var = rl5.d;
        b = new rl5(Arrays.copyOf(new byte[]{42}, 1));
        c = a.c("*");
        d = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
    }

    public PublicSuffixDatabase(PublicSuffixList publicSuffixList) {
        publicSuffixList.getClass();
        this.a = publicSuffixList;
    }

    public static List a(String str) {
        List listF0 = StringsKt.f0(str, new char[]{'.'});
        return Intrinsics.g(CollectionsKt.b0(listF0), "") ? CollectionsKt.P(listF0) : listF0;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        String strAccess$binarySearch;
        String strAccess$binarySearch2;
        String strAccess$binarySearch3;
        List<String> listF0;
        List<String> listF1;
        int size;
        int size2;
        domain.getClass();
        String unicode = IDN.toUnicode(domain);
        unicode.getClass();
        List listA = a(unicode);
        PublicSuffixList publicSuffixList = this.a;
        publicSuffixList.ensureLoaded();
        int size3 = listA.size();
        rl5[] rl5VarArr = new rl5[size3];
        for (int i = 0; i < size3; i++) {
            rl5 rl5Var = rl5.d;
            rl5VarArr[i] = rl5.a.c((String) listA.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strAccess$binarySearch = null;
                break;
            }
            strAccess$binarySearch = Companion.access$binarySearch(INSTANCE, publicSuffixList.getBytes(), rl5VarArr, i2);
            if (strAccess$binarySearch != null) {
                break;
            }
            i2++;
        }
        if (size3 <= 1) {
            strAccess$binarySearch2 = null;
            break;
        }
        rl5[] rl5VarArr2 = (rl5[]) rl5VarArr.clone();
        int length = rl5VarArr2.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                strAccess$binarySearch2 = null;
                break;
            }
            rl5VarArr2[i3] = b;
            strAccess$binarySearch2 = Companion.access$binarySearch(INSTANCE, publicSuffixList.getBytes(), rl5VarArr2, i3);
            if (strAccess$binarySearch2 != null) {
                break;
            }
            i3++;
        }
        if (strAccess$binarySearch2 == null) {
            strAccess$binarySearch3 = null;
            break;
        }
        int i4 = size3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                strAccess$binarySearch3 = null;
                break;
            }
            strAccess$binarySearch3 = Companion.access$binarySearch(INSTANCE, publicSuffixList.getExceptionBytes(), rl5VarArr, i5);
            if (strAccess$binarySearch3 != null) {
                break;
            }
            i5++;
        }
        if (strAccess$binarySearch3 != null) {
            listF1 = StringsKt.f0("!".concat(strAccess$binarySearch3), new char[]{'.'});
        } else if (strAccess$binarySearch == null && strAccess$binarySearch2 == null) {
            listF1 = c;
        } else {
            if (strAccess$binarySearch == null || (listF0 = StringsKt.f0(strAccess$binarySearch, new char[]{'.'})) == null) {
                listF0 = m2g.a;
            }
            if (strAccess$binarySearch2 == null || (listF1 = StringsKt.f0(strAccess$binarySearch2, new char[]{'.'})) == null) {
                listF1 = m2g.a;
            }
            if (listF0.size() > listF1.size()) {
                listF1 = listF0;
            }
        }
        if (listA.size() == listF1.size() && listF1.get(0).charAt(0) != '!') {
            return null;
        }
        if (listF1.get(0).charAt(0) == '!') {
            size = listA.size();
            size2 = listF1.size();
        } else {
            size = listA.size();
            size2 = listF1.size() + 1;
        }
        int i6 = size - size2;
        Sequence sequenceK = CollectionsKt.K(a(domain));
        if (i6 < 0) {
            kb5.a(pe4.b(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i6 != 0) {
            sequenceK = sequenceK instanceof zef ? ((zef) sequenceK).a(i6) : new ref(sequenceK, i6);
        }
        return ld80.g(sequenceK, ".", null, 62);
    }
}
