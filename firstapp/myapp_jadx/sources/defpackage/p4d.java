package defpackage;

import com.sportygames.commons.components.DeckCard;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.components.DeckCard", f = "DeckCard.kt", l = {114, 115, 116, 117, 118, 119}, m = "getDrawableForCard", v = 1)
public final class p4d extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ DeckCard b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4d(DeckCard deckCard, x1b x1bVar) {
        super(x1bVar);
        this.b = deckCard;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        int i = DeckCard.f;
        return this.b.a(null, this);
    }
}
