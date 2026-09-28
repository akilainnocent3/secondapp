package defpackage;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: loaded from: classes5.dex */
public final class ge3 implements MultiItemEntity, Comparable<ge3> {
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public sw2 E;
    public qeo F;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String i;
    public String v;
    public String w;
    public String y;
    public int z;

    @Override // java.lang.Comparable
    public final int compareTo(ge3 ge3Var) {
        ge3 ge3Var2 = ge3Var;
        boolean z = this.C;
        if (!z || ge3Var2.C) {
            return z == ge3Var2.C ? 0 : 1;
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public final int getItemType() {
        return this.a;
    }

    public final String toString() {
        return "BetsResultItem{itemType=" + this.a + ", eventId='" + this.b + "', homeTeamName='" + this.c + "', homeTeamLogo='" + this.d + "', homeTeamBaseColor='" + this.e + "', homeTeamSleeveColor='" + this.f + "', awayTeamName='" + this.i + "', awayTeamLogo='" + this.v + "', awayTeamBaseColor='" + this.w + "', awayTeamSleeveColor='" + this.y + "', homeTeamScore=" + this.z + ", awayTeamScore=" + this.A + ", resultSequence='" + this.B + "', userBet=" + this.C + ", isFirstIbEvent=" + this.D + ", oddsItem=" + this.E + ", footballScoreInfoState=" + this.F + '}';
    }
}
