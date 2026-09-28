package com.sporty.android.core.model.pocket.deposit;

/* JADX INFO: loaded from: classes.dex */
public class QuickInputItem implements Comparable<QuickInputItem> {
    public long amount;
    public long bounty;
    public String btnText;
    public boolean isSelected;
    public int line;
    public int order;
    public String text;

    @Override // java.lang.Comparable
    public int compareTo(QuickInputItem quickInputItem) {
        int i = this.line;
        int i2 = quickInputItem.line;
        return i == i2 ? this.order - quickInputItem.order : i - i2;
    }
}
