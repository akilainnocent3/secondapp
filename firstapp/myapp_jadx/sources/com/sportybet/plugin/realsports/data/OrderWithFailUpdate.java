package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import com.sporty.android.core.model.realsports.Order;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OrderWithFailUpdate extends Order {
    public List<Event> fcOutcomes;

    public OrderWithFailUpdate() {
    }

    public OrderWithFailUpdate(Parcel parcel) {
        super(parcel);
    }
}
