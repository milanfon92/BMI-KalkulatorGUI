<?php
/**
 * The base configurations of the WordPress.
 *
 * This file has the following configurations: MySQL settings, Table Prefix,
 * Secret Keys, and ABSPATH. You can find more information by visiting
 * {@link https://codex.wordpress.org/Editing_wp-config.php Editing wp-config.php}
 * Codex page. You can get the MySQL settings from your web host.
 *
 * This file is used by the wp-config.php creation script during the
 * installation. You don't have to use the web site, you can just copy this file
 * to "wp-config.php" and fill in the values.
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define('DB_NAME', 'lorijenc_wordpress_baza');

/** MySQL database username */
define('DB_USER', 'root');

/** MySQL database password */
define('DB_PASSWORD', '');

/** MySQL hostname */
define('DB_HOST', 'localhost');

/** Database Charset to use in creating database tables. */
define('DB_CHARSET', 'utf8');

/** The Database Collate type. Don't change this if in doubt. */
define('DB_COLLATE', '');

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define('AUTH_KEY',         ']_`]FpJekHe!t/DkGMt{{:#,@Uv6K-u7h$Z5#m8# AZVfQV6f4w*vS5^y=/BbX{U');
define('SECURE_AUTH_KEY',  '*l0?9I`xn#ZL[~Pc;e%h6PZETz$DJTc..[/*8{@emCeAv+@S2n7XvD8F-I}^K91b');
define('LOGGED_IN_KEY',    '^Imt[VOt(Pbf(Z/O!Em3-+KtYyHa}  o:.LG(H+5Sg&:k2|^FVsZc_g~nR1=-m|m');
define('NONCE_KEY',        '+g|]oCa<}MDIWXQvrZ2jh 3,NeS]U>_OuNDgGLlFlD9.*F]Xe@4=C]Y}:>TbdCfW');
define('AUTH_SALT',        ')*rlPWaV&-XF,~vx&?lHW}rDO:??G*cJSFhd }o9##wra!a8G-mA3<&[x!`u]<ZO');
define('SECURE_AUTH_SALT', 'n)[vE}u K(pHi[Y_h`IKW_|`7rP-0Cn=LMBCLGO6p)T5v}xw|b15(QD1eo(o_r#5');
define('LOGGED_IN_SALT',   'O#m8Fr;.G$P~LWOK{wvJrWC24wt6kb3PZN-*][Od[Gp<`pv:GH#*La`V83Ufx[qF');
define('NONCE_SALT',       '~l*bJ<BW!^)}ALqUb{I$$3~LN4>ti,~> iz+%yMkSM(s9WGWuO`P#[t_,8JT6C`1');

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each a unique
 * prefix. Only numbers, letters, and underscores please!
 */
$table_prefix  = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 */
define('WP_DEBUG', false);

/* That's all, stop editing! Happy blogging. */

/** Absolute path to the WordPress directory. */
if ( !defined('ABSPATH') )
	define('ABSPATH', dirname(__FILE__) . '/');

/** Sets up WordPress vars and included files. */
require_once(ABSPATH . 'wp-settings.php');
