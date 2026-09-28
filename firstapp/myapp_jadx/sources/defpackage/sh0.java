package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface sh0 {
    static fcb0 B0(dbx.a aVar, boolean z) {
        return new fcb0("Card" + (z ? "" : "_Out") + '_' + aVar.a.b + '_' + (aVar.b ? "Win" : "Lose"), false);
    }

    static fcb0 l0(dbx.a aVar, boolean z) {
        return new fcb0("BG_Transition" + (z ? "" : "Back") + '_' + aVar.a.b, false);
    }
}
