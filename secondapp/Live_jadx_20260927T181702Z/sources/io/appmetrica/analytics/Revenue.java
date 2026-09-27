package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C4969ce;
import io.appmetrica.analytics.impl.Fn;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;
    public final long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Fn f94983g = new Fn(new C4969ce("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f94984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Currency f94985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Integer f94986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f94987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f94988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Receipt f94989f;

        public /* synthetic */ Builder(long j10, Currency currency, int i10) {
            this(j10, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f94988e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f94987d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f94986c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f94989f = receipt;
            return this;
        }

        private Builder(long j10, Currency currency) {
            f94983g.a(currency);
            this.f94984a = j10;
            this.f94985b = currency;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f94990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f94991b;

            public /* synthetic */ Builder(int i10) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f94990a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f94991b = str;
                return this;
            }

            private Builder() {
            }
        }

        public /* synthetic */ Receipt(Builder builder, int i10) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f94990a;
            this.signature = builder.f94991b;
        }
    }

    public /* synthetic */ Revenue(Builder builder, int i10) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(j10, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f94984a;
        this.currency = builder.f94985b;
        this.quantity = builder.f94986c;
        this.productID = builder.f94987d;
        this.payload = builder.f94988e;
        this.receipt = builder.f94989f;
    }
}
