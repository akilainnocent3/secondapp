package tt;

import androidx.media3.session.fe;
import fr.a0;
import fr.h0;
import fr.q;
import fr.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,101:1\n5306#2,7:102\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion\n*L\n73#1:102,7\n*E\n"})
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public static final C1413a f137332f = new C1413a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final int[] f137333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f137335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f137336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public final List<Integer> f137337e;

    /* JADX INFO: renamed from: tt.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nBinaryVersion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n1549#2:102\n1620#2,3:103\n37#3,2:106\n*S KotlinDebug\n*F\n+ 1 BinaryVersion.kt\norg/jetbrains/kotlin/metadata/deserialization/BinaryVersion$Companion\n*L\n97#1:102\n97#1:103,3\n98#1:106,2\n*E\n"})
    public static final class C1413a {
        public /* synthetic */ C1413a(x xVar) {
            this();
        }

        public C1413a() {
        }
    }

    public a(@l int... numbers) {
        List<Integer> listJ;
        m0.p(numbers, "numbers");
        this.f137333a = numbers;
        Integer numWe = a0.We(numbers, 0);
        this.f137334b = numWe != null ? numWe.intValue() : -1;
        Integer numWe2 = a0.We(numbers, 1);
        this.f137335c = numWe2 != null ? numWe2.intValue() : -1;
        Integer numWe3 = a0.We(numbers, 2);
        this.f137336d = numWe3 != null ? numWe3.intValue() : -1;
        if (numbers.length <= 3) {
            listJ = h0.J();
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + numbers.length + kj.e.f102543c);
            }
            listJ = r0.a6(q.r(numbers).subList(3, numbers.length));
        }
        this.f137337e = listJ;
    }

    public final int a() {
        return this.f137334b;
    }

    public final int b() {
        return this.f137335c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f137334b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f137335c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f137336d >= i12;
    }

    public final boolean d(@l a version) {
        m0.p(version, "version");
        return c(version.f137334b, version.f137335c, version.f137336d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f137334b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f137335c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f137336d <= i12;
    }

    public boolean equals(@m Object obj) {
        if (obj == null || !m0.g(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137334b == aVar.f137334b && this.f137335c == aVar.f137335c && this.f137336d == aVar.f137336d && m0.g(this.f137337e, aVar.f137337e);
    }

    public final boolean f(@l a ourVersion) {
        m0.p(ourVersion, "ourVersion");
        int i10 = this.f137334b;
        if (i10 == 0) {
            return ourVersion.f137334b == 0 && this.f137335c == ourVersion.f137335c;
        }
        return i10 == ourVersion.f137334b && this.f137335c <= ourVersion.f137335c;
    }

    @l
    public final int[] g() {
        return this.f137333a;
    }

    public int hashCode() {
        int i10 = this.f137334b;
        int i11 = i10 + (i10 * 31) + this.f137335c;
        int i12 = i11 + (i11 * 31) + this.f137336d;
        return i12 + (i12 * 31) + this.f137337e.hashCode();
    }

    @l
    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : r0.r3(arrayList, fe.F, null, null, 0, null, null, 62, null);
    }
}
