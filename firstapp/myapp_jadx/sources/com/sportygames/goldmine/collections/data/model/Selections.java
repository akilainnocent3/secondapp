package com.sportygames.goldmine.collections.data.model;

import defpackage.rr1;
import defpackage.xbp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportygames/goldmine/collections/data/model/Selections;", "", "", "caves", "<init>", "(I)V", "copy", "(I)Lcom/sportygames/goldmine/collections/data/model/Selections;", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Selections {
    public final int a;

    public Selections(@xbp(name = "caves") int i) {
        this.a = i;
    }

    public final Selections copy(@xbp(name = "caves") int caves) {
        return new Selections(caves);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Selections) && this.a == ((Selections) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return rr1.b(new StringBuilder("Selections(caves="), this.a, ')');
    }
}
