package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class r6l extends kni0 {
    public final BreakIterator b;

    public r6l(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.b = characterInstance;
    }

    @Override // defpackage.kni0
    public final int n(int i) {
        return this.b.following(i);
    }

    @Override // defpackage.kni0
    public final int o(int i) {
        return this.b.preceding(i);
    }
}
