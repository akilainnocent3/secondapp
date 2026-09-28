package com.sporty.android.book.presentation.eventsorting;

import com.sportybet.android.gp.tz.R;
import defpackage.om2;
import defpackage.tag;
import defpackage.uhc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0000R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nÊ\u0001\u0002\b\r¨\u0006\f"}, d2 = {"Lcom/sporty/android/book/presentation/eventsorting/EventSortDirection;", "", "iconRes", "", "Landroidx/annotation/DrawableRes;", "<init>", "(Ljava/lang/String;II)V", "getIconRes", "()I", "ASCENDING", "DESCENDING", "toggle", "sportybook", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum EventSortDirection {
    ASCENDING(R.drawable.ic_sort_ascending),
    DESCENDING(R.drawable.ic_sort_descending);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int iconRes;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EventSortDirection.values().length];
            try {
                iArr[EventSortDirection.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventSortDirection.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    EventSortDirection(int i) {
        this.iconRes = i;
    }

    public static tag<EventSortDirection> getEntries() {
        return $ENTRIES;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final EventSortDirection toggle() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return DESCENDING;
        }
        if (i == 2) {
            return ASCENDING;
        }
        uhc.a();
        return null;
    }
}
