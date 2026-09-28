package com.sporty.android.core.model.config.bo;

import defpackage.ygp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;", "", "Primitive", "WithKClass", "Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption$Primitive;", "Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption$WithKClass;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BOConfigDeserializeOption {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption$Primitive;", "Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Primitive implements BOConfigDeserializeOption {
        public static final Primitive INSTANCE = new Primitive();

        private Primitive() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Primitive);
        }

        public int hashCode() {
            return -1089356432;
        }

        public String toString() {
            return "Primitive";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption$WithKClass;", "Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption;", "Lygp;", "kClass", "<init>", "(Lygp;)V", "component1", "()Lygp;", "copy", "(Lygp;)Lcom/sporty/android/core/model/config/bo/BOConfigDeserializeOption$WithKClass;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lygp;", "getKClass", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class WithKClass implements BOConfigDeserializeOption {
        private final ygp<?> kClass;

        public WithKClass(ygp<?> ygpVar) {
            ygpVar.getClass();
            this.kClass = ygpVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WithKClass copy$default(WithKClass withKClass, ygp ygpVar, int i, Object obj) {
            if ((i & 1) != 0) {
                ygpVar = withKClass.kClass;
            }
            return withKClass.copy(ygpVar);
        }

        public final ygp<?> component1() {
            return this.kClass;
        }

        public final WithKClass copy(ygp<?> kClass) {
            kClass.getClass();
            return new WithKClass(kClass);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithKClass) && Intrinsics.g(this.kClass, ((WithKClass) other).kClass);
        }

        public final ygp<?> getKClass() {
            return this.kClass;
        }

        public int hashCode() {
            return this.kClass.hashCode();
        }

        public String toString() {
            return "WithKClass(kClass=" + this.kClass + ")";
        }
    }
}
