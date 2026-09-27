package com.yandex.div.internal.parser;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface TypeHelper<T> {

    @oy.l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @oy.l
        public final <T> TypeHelper<T> from(@oy.l final T t10, @oy.l final ds.l<Object, Boolean> lVar) {
            return new TypeHelper<T>(t10, lVar) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                final /* synthetic */ ds.l<Object, Boolean> $validator;

                @oy.l
                private final T typeDefault;

                {
                    this.$validator = lVar;
                    this.typeDefault = t10;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                @oy.l
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(@oy.l Object obj) {
                    return this.$validator.invoke(obj).booleanValue();
                }
            };
        }
    }

    T getTypeDefault();

    boolean isTypeValid(@oy.l Object obj);
}
