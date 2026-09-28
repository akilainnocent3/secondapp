package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingLeague;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pwn {
    public static final /* synthetic */ int a = 0;

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            mae0.a(whs.b(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            mae0.a(whs.b(i, i2, "index: ", ", size: "));
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ks40.a(i3, dy5.a("fromIndex: ", i, i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hb5.a(whs.b(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final own d(NetworkInstantRacingLeague networkInstantRacingLeague) {
        networkInstantRacingLeague.getClass();
        String leagueId = networkInstantRacingLeague.getLeagueId();
        if (leagueId == null) {
            leagueId = "";
        }
        String iconUrl = networkInstantRacingLeague.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        String name = networkInstantRacingLeague.getName();
        return new own(leagueId, iconUrl, name != null ? name : "");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Enum e(Class cls, String str) {
        cls.getClass();
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr == 0) {
            throw new IllegalStateException(("Enum " + cls.getSimpleName() + " must contain enum values").toString());
        }
        for (aak aakVar : enumArr) {
            if (Intrinsics.g(((csm) aakVar).getValue(), str)) {
                if (aakVar == 0) {
                    return ((csm) ay0.w(enumArr)).getDefault();
                }
                return aakVar;
            }
        }
        aakVar = 0;
        if (aakVar == 0) {
            return ((csm) ay0.w(enumArr)).getDefault();
        }
        return aakVar;
    }
}
