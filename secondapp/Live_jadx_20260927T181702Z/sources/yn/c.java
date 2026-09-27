package yn;

import dr.u1;
import fr.q;
import java.util.ArrayList;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nScreenUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenUtil.kt\ncom/sports/live/football/tv/date/ScreenUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n11308#2:48\n11643#2,3:49\n37#3:52\n36#3,3:53\n*S KotlinDebug\n*F\n+ 1 ScreenUtil.kt\ncom/sports/live/football/tv/date/ScreenUtil\n*L\n9#1:48\n9#1:49,3\n9#1:52\n9#1:53,3\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f159777a;

    @l
    public final u1<String[], String[], String[]> a(@l String valueParams) {
        m0.p(valueParams, "valueParams");
        char[] charArray = valueParams.toCharArray();
        m0.o(charArray, "toCharArray(...)");
        ArrayList arrayList = new ArrayList(charArray.length);
        for (char c10 : charArray) {
            arrayList.add(String.valueOf(c10));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        int length = strArr.length;
        this.f159777a = length;
        int i10 = (length + 1) / 3;
        String[] strArr2 = (String[]) q.l1(strArr, 0, i10);
        String[] strArr3 = (String[]) q.l1(strArr, i10, length);
        return new u1<>(strArr2, (String[]) q.l1(strArr3, 0, (strArr3.length + 1) / 2), (String[]) q.l1(strArr3, (strArr3.length + 1) / 2, strArr3.length));
    }

    public final int b() {
        return this.f159777a;
    }

    public final int c() {
        return 1;
    }

    public final int d() {
        return 10;
    }

    public final int e() {
        return 11;
    }

    public final int f() {
        return 12;
    }

    public final int g() {
        return 13;
    }

    public final int h() {
        return 14;
    }

    public final int i() {
        return this.f159777a;
    }

    public final void j(int i10) {
        this.f159777a = i10;
    }
}
