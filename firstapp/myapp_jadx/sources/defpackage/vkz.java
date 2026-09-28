package defpackage;

import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class vkz {
    public static final vkz a;
    public static final vkz b;
    public static final vkz c;
    public static final vkz d;
    public static final /* synthetic */ vkz[] e;

    static {
        vkz vkzVar = new vkz(PBBetHistoryItemDTO.STATUS_WON, 0);
        a = vkzVar;
        vkz vkzVar2 = new vkz(PBBetHistoryItemDTO.STATUS_LOST, 1);
        b = vkzVar2;
        vkz vkzVar3 = new vkz(PBBetHistoryItemDTO.STATUS_CANCELLED, 2);
        c = vkzVar3;
        vkz vkzVar4 = new vkz(PBBetHistoryItemDTO.STATUS_PENDING, 3);
        d = vkzVar4;
        e = new vkz[]{vkzVar, vkzVar2, vkzVar3, vkzVar4};
    }

    public vkz() {
        throw null;
    }

    public static vkz valueOf(String str) {
        return (vkz) Enum.valueOf(vkz.class, str);
    }

    public static vkz[] values() {
        return (vkz[]) e.clone();
    }
}
