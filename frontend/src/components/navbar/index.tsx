import { ReactComponent as GitIcon } from 'assets/img/git.svg';
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsgrove-nav-content'>
                    <h1>DsGrove</h1>
                    
                    <a href="https://github.com/yulealmeida">
                        <div className='dsgrove-contact-container'>
                            <GitIcon />
                            <p className='dsgrove-contact-link'>/yulealmeida</p>
                        </div>
                        </a>


                </div>
            </nav>
        </header>
    );
}
export default Navbar