// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class WalletPool {
    public abstract Logger getLogger();

    public abstract Preferences getPreferences();

    public abstract void getWalletCount(I32Callback callback);

    public abstract void getWallets(int from, int size, WalletListCallback callback);

    public abstract void getWallet(String name, WalletCallback callback);

    public abstract void createWallet(String name, Currency currency, DynamicObject configuration, WalletCallback callback);

    public abstract void getCurrencies(CurrencyListCallback callback);

    public abstract void getCurrency(String name, CurrencyCallback callback);

    private static final class CppProxy extends WalletPool
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public Logger getLogger()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getLogger(this.nativeRef);
        }
        private native Logger native_getLogger(long _nativeRef);

        @Override
        public Preferences getPreferences()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getPreferences(this.nativeRef);
        }
        private native Preferences native_getPreferences(long _nativeRef);

        @Override
        public void getWalletCount(I32Callback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getWalletCount(this.nativeRef, callback);
        }
        private native void native_getWalletCount(long _nativeRef, I32Callback callback);

        @Override
        public void getWallets(int from, int size, WalletListCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getWallets(this.nativeRef, from, size, callback);
        }
        private native void native_getWallets(long _nativeRef, int from, int size, WalletListCallback callback);

        @Override
        public void getWallet(String name, WalletCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getWallet(this.nativeRef, name, callback);
        }
        private native void native_getWallet(long _nativeRef, String name, WalletCallback callback);

        @Override
        public void createWallet(String name, Currency currency, DynamicObject configuration, WalletCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_createWallet(this.nativeRef, name, currency, configuration, callback);
        }
        private native void native_createWallet(long _nativeRef, String name, Currency currency, DynamicObject configuration, WalletCallback callback);

        @Override
        public void getCurrencies(CurrencyListCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getCurrencies(this.nativeRef, callback);
        }
        private native void native_getCurrencies(long _nativeRef, CurrencyListCallback callback);

        @Override
        public void getCurrency(String name, CurrencyCallback callback)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_getCurrency(this.nativeRef, name, callback);
        }
        private native void native_getCurrency(long _nativeRef, String name, CurrencyCallback callback);
    }
}
