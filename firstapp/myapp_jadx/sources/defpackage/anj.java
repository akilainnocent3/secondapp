package defpackage;

import com.sportygames.sportysoccer.model.GameData;

/* JADX INFO: loaded from: classes8.dex */
public final class anj extends nmj {
    public int d;
    public int e;

    @Override // defpackage.nmj, defpackage.mmj
    public final void e(boolean z, omj omjVar) {
        if (z) {
            this.d++;
        }
        omjVar.y(new GameData(null, !z, this.d, 0));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final int g() {
        return this.e;
    }

    @Override // defpackage.mmj
    public final boolean i(String str) {
        switch (str) {
            case "tutorial_dialog_welcome":
            case "tutorial_balls_layout":
            case "tutorial_dialog_real_money_mode":
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void n(lmj lmjVar) {
        nmj.s(this.a.A(), new zmj(lmjVar));
    }

    @Override // defpackage.nmj, defpackage.mmj
    public final void p(int i) {
        this.e = i;
    }
}
